package net.solarelixir.solaris.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.TreelingEntity;

public class TreelingModel<T extends TreelingEntity> extends SinglePartEntityModel<T> {

    public static final EntityModelLayer TREELING =
            new EntityModelLayer(Identifier.of(TelumSolaris.MOD_ID, "treeling"), "main");

    private final ModelPart treeling;
    private final ModelPart head;

    public TreelingModel(ModelPart root) {
        this.treeling = root.getChild("treeling");
        this.head = this.treeling.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData treeling = modelPartData.addChild("treeling", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        ModelPartData head = treeling.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -8.0F, 0.0F));


        treeling.addChild("left_leg", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        treeling.addChild("right_leg", ModelPartBuilder.create().uv(16, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F), ModelTransform.pivot(2.0F, -4.0F, 0.0F));
        treeling.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), ModelTransform.pivot(0.0F, -8.0F, 0.0F));

        return TexturedModelData.of(modelData, 32, 32);
    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30f, 30f);
        headPitch = MathHelper.clamp(headYaw, -25f, 45f);

        this.head.yaw = headYaw * 0.017453292f;
        this.head.pitch = headPitch * 0.017453292f;
    }

    @Override
    public void setAngles(TreelingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(TreelingAnimations.walking, limbSwing, limbSwingAmount, 8f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, TreelingAnimations.idle, ageInTicks, 1f);

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        treeling.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return treeling;
    }
}
