package net.solarelixir.solaris.entity.client;

import com.google.common.collect.Maps;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;
import net.solarelixir.solaris.entity.custom.MushlingVariant;
import net.solarelixir.solaris.entity.custom.TreelingEntity;
import net.solarelixir.solaris.entity.custom.TreelingVariant;

import java.util.Map;

public class MonstrositreeRenderer extends MobEntityRenderer<MonstrositreeEntity, MonstrositreeModel<MonstrositreeEntity>> {

    public MonstrositreeRenderer(EntityRendererFactory.Context context) {
        super(context, new MonstrositreeModel<>(context.getPart(MonstrositreeModel.MONSTROSITREE)), 1f);
    }

    @Override
    public Identifier getTexture(MonstrositreeEntity entity) {
        return Identifier.of(TelumSolaris.MOD_ID, "textures/entity/monstrositree/monstrositree.png");
    }
}
