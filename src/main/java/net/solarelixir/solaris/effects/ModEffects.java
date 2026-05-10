package net.solarelixir.solaris.effects;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;

public class ModEffects {

   /* public static final RegistryEntry<StatusEffect> VULNERABLE = registerStatusEffect("vulnerable",
            new VulnerableEffect(StatusEffectCategory.HARMFUL, 0x53617a));*/

    public static final RegistryEntry<StatusEffect> SCARLETT_HAZE = registerStatusEffect("scarlett_haze",
            new ScarlettHazeEffect(StatusEffectCategory.HARMFUL, 0x99002b));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(TelumSolaris.MOD_ID, name), statusEffect);
    }
    public static void registerEffects() {
        TelumSolaris.LOGGER.info("Registering mod effects for " + TelumSolaris.MOD_ID);
    }
}
