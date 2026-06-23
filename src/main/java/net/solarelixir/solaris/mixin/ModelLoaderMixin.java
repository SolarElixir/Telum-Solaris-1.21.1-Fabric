package net.solarelixir.solaris.mixin;

import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.solarelixir.solaris.TelumSolaris;
import net.solarelixir.solaris.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

//Provided by KaupenJoe + Community
//Modified by SolarElixir

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {

    @Shadow
    protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1))
    private void onInit(CallbackInfo ci) {
        List<Item> iconHavingItems = List.of(
                ModItems.OPAL_LONGSWORD, ModItems.OPAL_HALBERD,
                ModItems.JADE_GREATSWORD, ModItems.JADE_HALBERD,
                ModItems.ONYX_GREATSWORD, ModItems.ONYX_HALBERD,
                ModItems.TOPAZ_GREATSWORD, ModItems.TOPAZ_HALBERD,
                ModItems.RUBY_LONGSWORD, ModItems.RUBY_HALBERD,
                ModItems.SAPPHIRE_LONGSWORD, ModItems.SAPPHIRE_HALBERD,
                ModItems.DIAMOND_LONGSWORD, ModItems.DIAMOND_HALBERD,
                ModItems.STEEL_LONGSWORD, ModItems.STEEL_HALBERD,
                ModItems.IRON_LONGSWORD, ModItems.IRON_HALBERD
        );

        for (Item i : iconHavingItems) {
            this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Registries.ITEM.getId(i) + "_icon")));

        }
    }
}