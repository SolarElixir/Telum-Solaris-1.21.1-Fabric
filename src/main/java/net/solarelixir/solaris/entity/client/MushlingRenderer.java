package net.solarelixir.solaris.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.MushlingEntity;
import net.solarelixir.solaris.entity.custom.MushlingVariant;
import net.solarelixir.solaris.entity.custom.TreelingVariant;

import java.util.Map;

public class MushlingRenderer extends MobEntityRenderer<MushlingEntity, MushlingModel<MushlingEntity>> {

    private static final Map<MushlingVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(MushlingVariant.class), map -> {
                map.put(MushlingVariant.RED,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/mushling/mushling_red.png"));
                map.put(MushlingVariant.RED_SCARED,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/mushling/mushling_red_scared.png"));
                map.put(MushlingVariant.BROWN,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/mushling/mushling_brown.png"));
                map.put(MushlingVariant.BROWN_SCARED,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/mushling/mushling_brown_scared.png"));
            });

    public MushlingRenderer(EntityRendererFactory.Context context) {
        super(context, new MushlingModel<>(context.getPart(MushlingModel.MUSHLING)), 0.4f);
    }

    @Override
    public Identifier getTexture(MushlingEntity entity) {
        MushlingVariant variant = entity.getVariant();
        return LOCATION_BY_VARIANT.getOrDefault(variant,
                LOCATION_BY_VARIANT.get(MushlingVariant.RED));
    }

    @Override
    public void render(MushlingEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
