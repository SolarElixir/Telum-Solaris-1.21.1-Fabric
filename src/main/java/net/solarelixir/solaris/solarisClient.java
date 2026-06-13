package net.solarelixir.solaris;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.solarelixir.solaris.entity.ModEntities;
import net.solarelixir.solaris.entity.client.MushlingModel;
import net.solarelixir.solaris.entity.client.MushlingRenderer;
import net.solarelixir.solaris.entity.client.TreelingModel;
import net.solarelixir.solaris.entity.client.TreelingRenderer;
import net.solarelixir.solaris.util.ModModelPredicates;

public class solarisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicates.registerModelPredicates();


        EntityModelLayerRegistry.registerModelLayer(TreelingModel.TREELING, TreelingModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.TREELING, TreelingRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MushlingModel.MUSHLING, MushlingModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MUSHLING, MushlingRenderer::new);
    }
}
