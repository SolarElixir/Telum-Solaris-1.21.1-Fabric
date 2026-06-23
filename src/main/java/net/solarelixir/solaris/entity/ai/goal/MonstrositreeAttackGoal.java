package net.solarelixir.solaris.entity.ai.goal;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;

public class MonstrositreeAttackGoal extends MeleeAttackGoal {
    private final MonstrositreeEntity monstrositree;
    private int ticks;

    public MonstrositreeAttackGoal(MonstrositreeEntity monstrositree, double speed, boolean pauseWhenMobIdle) {
        super(monstrositree, speed, pauseWhenMobIdle);
        this.monstrositree = monstrositree;
    }

    @Override
    public void start() {
        super.start();
        this.ticks = 0;
    }

    @Override
    public void stop() {
        super.stop();
        this.monstrositree.setAttacking(false);
    }

    @Override
    public void tick() {
        super.tick();
        this.ticks++;
        if (this.ticks >= 10 && this.getCooldown() < this.getMaxCooldown()/2) {
            this.monstrositree.setAttacking(true);
        } else {
            this.monstrositree.setAttacking(false);
        }
    }
}
