package net.solarelixir.solaris.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.MushlingEntity;
import net.solarelixir.solaris.entity.custom.TreelingEntity;

public class MushlingModel<T extends MushlingEntity> extends SinglePartEntityModel<T> {

    public static final EntityModelLayer MUSHLING =
            new EntityModelLayer(Identifier.of(TelumSolaris.MOD_ID, "mushling"), "main");

    private final ModelPart root;
    private final ModelPart head;

    public MushlingModel(ModelPart root) {
        this.root = root.getChild("root");
        this.head = this.root.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData left_leg = root.addChild("left_leg", ModelPartBuilder.create().uv(32, 18).cuboid(-4.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_leg = root.addChild("right_leg", ModelPartBuilder.create().uv(32, 26).cuboid(0.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(0, 18).cuboid(-4.0F, -1.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-7.0F, -5.0F, -7.0F, 14.0F, 4.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -11.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        root.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30f, 30f);
        headPitch = MathHelper.clamp(headYaw, -25f, 45f);

        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }


    @Override
    public void setAngles(MushlingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(MushlingAnimations.walking, limbSwing, limbSwingAmount, 8f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, MushlingAnimations.idle, ageInTicks, 1f);

    }
}
