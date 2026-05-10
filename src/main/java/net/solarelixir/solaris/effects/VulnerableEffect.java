package net.solarelixir.solaris.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class VulnerableEffect extends StatusEffect {
    public VulnerableEffect(StatusEffectCategory category, int color) {
        super(StatusEffectCategory.HARMFUL, 0x53617a);
    }

}
