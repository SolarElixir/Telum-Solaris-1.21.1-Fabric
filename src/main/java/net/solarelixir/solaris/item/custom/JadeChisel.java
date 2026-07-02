package net.solarelixir.solaris.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.solarelixir.solaris.component.SolarisDataComponentTypes;

import java.util.Map;

public class JadeChisel extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.ofEntries(
                    Map.entry(Blocks.STONE, Blocks.STONE_BRICKS),
                    Map.entry(Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS),
                    Map.entry(Blocks.MOSSY_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS),
                    Map.entry(Blocks.CRACKED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS),
                    Map.entry(Blocks.CHISELED_STONE_BRICKS, Blocks.SMOOTH_STONE),
                    Map.entry(Blocks.SMOOTH_STONE, Blocks.STONE),

                    Map.entry(Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS),
                    Map.entry(Blocks.POLISHED_BLACKSTONE_BRICKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS),
                    Map.entry(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Blocks.POLISHED_BLACKSTONE),
                    Map.entry(Blocks.POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE),
                    Map.entry(Blocks.CHISELED_POLISHED_BLACKSTONE, Blocks.BLACKSTONE),

                    Map.entry(Blocks.NETHERRACK, Blocks.NETHER_BRICKS),
                    Map.entry(Blocks.NETHER_BRICKS, Blocks.CRACKED_NETHER_BRICKS),
                    Map.entry(Blocks.CRACKED_NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS),
                    Map.entry(Blocks.CHISELED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS),
                    Map.entry(Blocks.RED_NETHER_BRICKS, Blocks.NETHERRACK),

                    Map.entry(Blocks.COBBLED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS),
                    Map.entry(Blocks.DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS),
                    Map.entry(Blocks.CRACKED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_TILES),
                    Map.entry(Blocks.DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES),
                    Map.entry(Blocks.CRACKED_DEEPSLATE_TILES, Blocks.POLISHED_DEEPSLATE),
                    Map.entry(Blocks.POLISHED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE),
                    Map.entry(Blocks.CHISELED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE),

                    Map.entry(Blocks.GRANITE, Blocks.POLISHED_GRANITE),
                    Map.entry(Blocks.POLISHED_GRANITE, Blocks.GRANITE),

                    Map.entry(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE),
                    Map.entry(Blocks.POLISHED_ANDESITE, Blocks.ANDESITE),

                    Map.entry(Blocks.DIORITE, Blocks.POLISHED_DIORITE),
                    Map.entry(Blocks.POLISHED_DIORITE, Blocks.DIORITE),

                    Map.entry(Blocks.BASALT, Blocks.SMOOTH_BASALT),
                    Map.entry(Blocks.SMOOTH_BASALT, Blocks.POLISHED_BASALT),
                    Map.entry(Blocks.POLISHED_BASALT, Blocks.BASALT),

                    Map.entry(Blocks.END_STONE, Blocks.END_STONE_BRICKS),
                    Map.entry(Blocks.END_STONE_BRICKS, Blocks.END_STONE),

                    Map.entry(Blocks.PACKED_MUD, Blocks.MUD_BRICKS),
                    Map.entry(Blocks.MUD_BRICKS, Blocks.PACKED_MUD),

                    Map.entry(Blocks.TUFF, Blocks.TUFF_BRICKS),
                    Map.entry(Blocks.TUFF_BRICKS, Blocks.POLISHED_TUFF),
                    Map.entry(Blocks.POLISHED_TUFF, Blocks.CHISELED_TUFF),
                    Map.entry(Blocks.CHISELED_TUFF, Blocks.CHISELED_TUFF_BRICKS),
                    Map.entry(Blocks.CHISELED_TUFF_BRICKS, Blocks.TUFF),

                    Map.entry(Blocks.SANDSTONE, Blocks.CUT_SANDSTONE),
                    Map.entry(Blocks.CUT_SANDSTONE, Blocks.SMOOTH_SANDSTONE),
                    Map.entry(Blocks.SMOOTH_SANDSTONE, Blocks.CHISELED_SANDSTONE),
                    Map.entry(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE),

                    Map.entry(Blocks.RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE),
                    Map.entry(Blocks.CUT_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE),
                    Map.entry(Blocks.SMOOTH_RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE),
                    Map.entry(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE),

                    Map.entry(Blocks.PURPUR_BLOCK, Blocks.PURPUR_PILLAR),
                    Map.entry(Blocks.PURPUR_PILLAR, Blocks.PURPUR_BLOCK),

                    Map.entry(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BRICKS),
                    Map.entry(Blocks.QUARTZ_BRICKS, Blocks.SMOOTH_QUARTZ),
                    Map.entry(Blocks.SMOOTH_QUARTZ, Blocks.CHISELED_QUARTZ_BLOCK),
                    Map.entry(Blocks.CHISELED_QUARTZ_BLOCK, Blocks.QUARTZ_PILLAR),
                    Map.entry(Blocks.QUARTZ_PILLAR, Blocks.QUARTZ_BLOCK),

                    Map.entry(Blocks.PRISMARINE, Blocks.PRISMARINE_BRICKS),
                    Map.entry(Blocks.PRISMARINE_BRICKS, Blocks.DARK_PRISMARINE),
                    Map.entry(Blocks.DARK_PRISMARINE, Blocks.PRISMARINE)
            );


    public JadeChisel(Settings settings) {
        super(settings.rarity(Rarity.EPIC));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if (CHISEL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient){
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world),((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_SMITHING_TABLE_USE, SoundCategory.BLOCKS);
                context.getStack().set(SolarisDataComponentTypes.COORDINATES, context.getBlockPos());
            }
        }

        return ActionResult.SUCCESS;
    }
}
