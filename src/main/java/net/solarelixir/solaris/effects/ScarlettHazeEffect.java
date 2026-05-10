package net.solarelixir.solaris.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ScarlettHazeEffect extends StatusEffect {

    protected ScarlettHazeEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        /*Entity attacker = entity.getRecentDamageSource() != null
                ? entity.getRecentDamageSource().getAttacker()
                : null;
        if (attacker instanceof PlayerEntity player) {
            entity.damage(entity.getDamageSources().indirectMagic(player, player), 0.75f*amplifier);
        } else {*/
            entity.damage(entity.getDamageSources().magic(), 0.75f*(amplifier+1));
        //}
        return super.applyUpdateEffect(entity, amplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 40 == 0;
    }
}
