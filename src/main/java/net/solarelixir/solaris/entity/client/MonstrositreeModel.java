package net.solarelixir.solaris.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.entity.custom.MonstrositreeEntity;
//Concept art provided by BrickNinja5524!

public class MonstrositreeModel<T extends MonstrositreeEntity> extends SinglePartEntityModel<T> {

    public static final EntityModelLayer MONSTROSITREE =
            new EntityModelLayer(Identifier.of(TelumSolaris.MOD_ID, "monstrositree"), "main");

    private final ModelPart root;
    private final ModelPart head;

    public MonstrositreeModel(ModelPart root) {
        this.root = root.getChild("root");
        this.head = this.root.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData left_leg = root.addChild("left_leg", ModelPartBuilder.create().uv(96, 92).cuboid(-6.0F, 0.0F, -6.0F, 12.0F, 20.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(-6.0F, -20.0F, 0.0F));

        ModelPartData right_leg = root.addChild("right_leg", ModelPartBuilder.create().uv(0, 116).cuboid(-6.0F, 0.0F, -6.0F, 12.0F, 20.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -20.0F, 0.0F));

        ModelPartData right_arm = root.addChild("right_arm", ModelPartBuilder.create().uv(48, 116).cuboid(0.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F))
                .uv(96, 124).cuboid(1.0F, 6.0F, -5.0F, 10.0F, 20.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, -46.0F, 0.0F));

        ModelPartData left_arm = root.addChild("left_arm", ModelPartBuilder.create().uv(120, 0).cuboid(-11.6667F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, new Dilation(0.0F))
                .uv(120, 24).cuboid(-10.6667F, 6.0F, -5.0F, 10.0F, 20.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(-12.3333F, -46.0F, 0.0F));

        ModelPartData weapon = left_arm.addChild("weapon", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -2.0F, -12.4444F, 4.0F, 4.0F, 56.0F, new Dilation(0.0F))
                .uv(160, 40).cuboid(-1.0F, 2.0F, -4.4444F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(160, 47).cuboid(-1.0F, -4.0F, -4.4444F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F))
                .uv(30, 159).cuboid(-1.0F, -6.0F, -6.4444F, 2.0F, 2.0F, 9.0F, new Dilation(0.0F))
                .uv(52, 159).cuboid(-1.0F, 4.0F, -6.4444F, 2.0F, 2.0F, 9.0F, new Dilation(0.0F))
                .uv(144, 101).cuboid(-1.0F, -8.0F, -8.4444F, 2.0F, 2.0F, 13.0F, new Dilation(0.0F))
                .uv(0, 148).cuboid(-1.0F, 6.0F, -8.4444F, 2.0F, 2.0F, 13.0F, new Dilation(0.0F))
                .uv(136, 124).cuboid(-2.0F, -10.0F, -10.4444F, 4.0F, 2.0F, 17.0F, new Dilation(0.0F))
                .uv(48, 140).cuboid(-2.0F, 8.0F, -10.4444F, 4.0F, 2.0F, 17.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.6667F, 21.0F, -23.5556F));

        ModelPartData torso = root.addChild("torso", ModelPartBuilder.create().uv(0, 60).cuboid(-23.0F, -32.0F, -7.0F, 24.0F, 32.0F, 24.0F, new Dilation(0.0F)), ModelTransform.pivot(11.0F, -20.0F, -5.0F));

        ModelPartData head = root.addChild("head", ModelPartBuilder.create().uv(96, 60).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -52.0F, 0.0F));

        ModelPartData crown = head.addChild("crown", ModelPartBuilder.create().uv(160, 88).cuboid(-19.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 58).cuboid(-21.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(144, 54).cuboid(-15.0F, -2.0F, -3.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 163).cuboid(-9.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 64).cuboid(-17.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 76).cuboid(-11.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 70).cuboid(-7.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(96, 162).cuboid(-11.0F, -4.0F, 11.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(74, 166).cuboid(-19.0F, -2.0F, 11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(104, 162).cuboid(-21.0F, -4.0F, 11.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 163).cuboid(-17.0F, -4.0F, 11.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(156, 54).cuboid(-15.0F, -2.0F, 11.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 167).cuboid(-9.0F, -2.0F, 11.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(8, 163).cuboid(-7.0F, -4.0F, 11.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(112, 163).cuboid(-7.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(120, 54).cuboid(-7.0F, -2.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(160, 82).cuboid(-7.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(120, 163).cuboid(-21.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 153).cuboid(-21.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(132, 54).cuboid(-21.0F, -2.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
                .uv(128, 163).cuboid(-21.0F, -2.0F, 9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 159).cuboid(-21.0F, -4.0F, 7.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(88, 162).cuboid(-7.0F, -4.0F, 7.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(160, 165).cuboid(-7.0F, -2.0F, 9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -16.0F, -5.0F));

        ModelPartData beard = head.addChild("beard", ModelPartBuilder.create().uv(136, 153).cuboid(-19.0F, -4.0F, 9.0F, 8.0F, 10.0F, 4.0F, new Dilation(0.0F))
                .uv(136, 143).cuboid(-23.0F, -12.0F, 11.0F, 16.0F, 4.0F, 6.0F, new Dilation(0.0F))
                .uv(144, 92).cuboid(-23.0F, -8.0F, 8.0F, 16.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, 8.0F, -25.0F));

        ModelPartData cube_r1 = beard.addChild("cube_r1", ModelPartBuilder.create().uv(30, 148).cuboid(-3.0F, -2.0F, -1.5F, 6.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -4.0F, 11.5F, 0.0F, 0.0F, -0.7854F));

        ModelPartData cube_r2 = beard.addChild("cube_r2", ModelPartBuilder.create().uv(116, 154).cuboid(-3.0F, -3.0F, -1.5F, 5.0F, 6.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-19.0F, -4.0F, 11.5F, 0.0F, 0.0F, -0.7854F));

        ModelPartData cube_r3 = beard.addChild("cube_r3", ModelPartBuilder.create().uv(74, 159).cuboid(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-15.0F, 6.0F, 11.5F, 0.0F, 0.0F, 0.7854F));

        ModelPartData cube_r4 = beard.addChild("cube_r4", ModelPartBuilder.create().uv(160, 32).cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-19.0F, -8.0F, 11.0F, 0.0F, 0.0F, -0.3927F));

        ModelPartData cube_r5 = beard.addChild("cube_r5", ModelPartBuilder.create().uv(160, 24).cuboid(-4.0F, -2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -8.0F, 11.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r6 = beard.addChild("cube_r6", ModelPartBuilder.create().uv(90, 154).cuboid(-4.0F, -2.0F, -2.0F, 9.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, -12.0F, 15.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData cube_r7 = beard.addChild("cube_r7", ModelPartBuilder.create().uv(144, 116).cuboid(-5.0F, -2.0F, -2.0F, 9.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-19.0F, -12.0F, 15.0F, 0.0F, 0.0F, -0.3927F));
        return TexturedModelData.of(modelData, 256, 256);
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
    public void setAngles(MonstrositreeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(MonstrositreeAnimations.walk, limbSwing, limbSwingAmount, 8f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, MonstrositreeAnimations.idle, ageInTicks, 1f);
    }
}
