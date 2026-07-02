package net.solarelixir.solaris.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;
import net.solarelixir.solaris.entity.custom.MushlingEntity;
import net.solarelixir.solaris.entity.custom.TreelingEntity;

public class SolarisEntities {
    public static final EntityType<TreelingEntity> TREELING = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TelumSolaris.MOD_ID, "treeling"),
            EntityType.Builder.create(TreelingEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.5f, 0.75f).build());

    public static EntityType<MushlingEntity> MUSHLING = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TelumSolaris.MOD_ID, "mushling"),
            EntityType.Builder.create(MushlingEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.75f, 0.85f).build());

    public static EntityType<MonstrositreeEntity> MONSTROSITREE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(TelumSolaris.MOD_ID, "monstrositree"),
            EntityType.Builder.create(MonstrositreeEntity::new, SpawnGroup.CREATURE)
                    .dimensions(2f, 4f).build());


    public static void registerModEntities() {
        TelumSolaris.LOGGER.info("Registering mod entities for " + TelumSolaris.MOD_ID);
    }
}
