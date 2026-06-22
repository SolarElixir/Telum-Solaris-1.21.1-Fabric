package net.solarelixir.solaris.mixin;

import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//Provided by KaupenJoe + Community
//Modified by SolarElixir

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {

    @Shadow
    protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1))
    private void onInit(CallbackInfo ci) {

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "opal_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "opal_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "jade_greatsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "jade_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "onyx_greatsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "onyx_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "ruby_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "ruby_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "topaz_greatsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "topaz_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "sapphire_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "sapphire_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "iron_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "iron_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "steel_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "steel_halberd_icon")));

        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "diamond_longsword_icon")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(TelumSolaris.MOD_ID, "diamond_halberd_icon")));
    }
}