package net.solarelixir.solaris;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.solarelixir.solaris.entity.ModEntities;
import net.solarelixir.solaris.entity.client.*;
import net.solarelixir.solaris.util.ModModelPredicates;

public class solarisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();


        EntityModelLayerRegistry.registerModelLayer(TreelingModel.TREELING, TreelingModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.TREELING, TreelingRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MushlingModel.MUSHLING, MushlingModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MUSHLING, MushlingRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MonstrositreeModel.MONSTROSITREE, MonstrositreeModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MONSTROSITREE, MonstrositreeRenderer::new);
    }
}
