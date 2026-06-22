package net.solarelixir.solaris.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.registry.Registries;
import net.solarelixir.solaris.TelumSolaris;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.util.ModTags;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

//Provided by KaupenJoe + Community
//Modified by SolarElixir

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Shadow
    @Final
    private ItemModels models;

    @Shadow
    public abstract ItemModels getModels();

    @ModifyVariable(
            method = "renderItem(Lnet/minecraft/item/ItemStack; Lnet/minecraft/client/render/model/json/ModelTransformationMode; ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider; IILnet/minecraft/client/render/model/BakedModel;)V",
            at = @At(value = "HEAD"),
            argsOnly = true
    )

    public BakedModel renderItem(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack, @Local(argsOnly = true) ModelTransformationMode renderMode) {
        if (stack.isIn(ModTags.Items.HAS_ICON) && renderMode == ModelTransformationMode.GUI) {
            Identifier id = Registries.ITEM.getId(stack.getItem());
            return getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, id.getPath() + "_icon")));
        }
        return bakedModel;
    }

    @ModifyVariable(
            method = "getModel",
            at = @At(value = "STORE"),
            ordinal = 1
    )
    public BakedModel getHeldItemModelMixin(BakedModel bakedModel, @Local(argsOnly = true) ItemStack stack) {
        if (stack.isIn(ModTags.Items.HAS_ICON)) {
            return this.models.getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, (Registries.ITEM.getId(stack.getItem()).getPath()))));
        }
        return bakedModel;
    }
}