package net.solarelixir.solaris.entity.ai.goal;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;

public class MonstrositreeAttackGoal extends MeleeAttackGoal {
    private final MonstrositreeEntity monstrositree;
    private int ticks;

    public MonstrositreeAttackGoal(MonstrositreeEntity monstrositree, double speed) {
        super(monstrositree, speed, false);
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
        this.monstrositree.setAttacking(this.ticks >= 10 && this.getCooldown() < this.getMaxCooldown() / 2);
    }

    @Override
    public boolean canAttack(LivingEntity target) {
        return super.canAttack(target);
    }

    @Override
    protected void resetCooldown() {
        super.resetCooldown();
    }
}
