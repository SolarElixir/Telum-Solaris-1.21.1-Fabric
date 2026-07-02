package net.solarelixir.solaris;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.solarelixir.solaris.entity.SolarisEntities;
import net.solarelixir.solaris.entity.client.*;
import net.solarelixir.solaris.util.SolarisModelPredicates;

public class solarisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SolarisModelPredicates.registerModelPredicates();


        EntityModelLayerRegistry.registerModelLayer(TreelingModel.TREELING, TreelingModel::getTexturedModelData);
        EntityRendererRegistry.register(SolarisEntities.TREELING, TreelingRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MushlingModel.MUSHLING, MushlingModel::getTexturedModelData);
        EntityRendererRegistry.register(SolarisEntities.MUSHLING, MushlingRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MonstrositreeModel.MONSTROSITREE, MonstrositreeModel::getTexturedModelData);
        EntityRendererRegistry.register(SolarisEntities.MONSTROSITREE, MonstrositreeRenderer::new);
    }
}
