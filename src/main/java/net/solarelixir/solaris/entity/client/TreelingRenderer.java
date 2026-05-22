package net.solarelixir.solaris.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.TreelingEntity;
import net.solarelixir.solaris.entity.custom.TreelingVariant;

import java.util.Map;

public class TreelingRenderer extends MobEntityRenderer<TreelingEntity, TreelingModel<TreelingEntity>> {

    private static final Map<TreelingVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(TreelingVariant.class), map -> {
                map.put(TreelingVariant.DEFAULT,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/treeling/treeling.png"));
                map.put(TreelingVariant.STRIPPED,
                        Identifier.of(TelumSolaris.MOD_ID, "textures/entity/treeling/stripped_treeling.png"));
            });

    public TreelingRenderer(EntityRendererFactory.Context context) {
        super(context, new TreelingModel<>(context.getPart(TreelingModel.TREELING)), 0.4f);
    }

    @Override
    public Identifier getTexture(TreelingEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(TreelingEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
