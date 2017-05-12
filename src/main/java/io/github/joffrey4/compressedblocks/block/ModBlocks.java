package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    // Compressed Woods
    public static BlockCompressedLog compressedOak;
    public static BlockCompressedLog compressedSpruce;
    public static BlockCompressedLog compressedBirch;
    public static BlockCompressedLog compressedJungle;
    public static BlockCompressedLog compressedAcacia;
    public static BlockCompressedLog compressedDarkOak;

    // Compressed Falling blocks
    public static BlockCompressedFalling compressedGravel;
    public static BlockCompressedSand compressedSand;
    public static BlockCompressedSand compressedRedSand;

    // Others compressed blocks
    public static BlockCompressed compressedDirt;
    public static BlockCompressed compressedStone;
    public static BlockCompressed compressedCobblestone;
    public static BlockCompressed compressedSoulSand;
    public static BlockCompressed compressedNetherrack;

    public static void init() {

        // Compressed Woods
        compressedOak = register(new BlockCompressedLog("compressedOak", Blocks.LOG, 0));
        compressedSpruce = register(new BlockCompressedLog("compressedSpruce", Blocks.LOG, 1));
        compressedBirch = register(new BlockCompressedLog("compressedBirch", Blocks.LOG, 2));
        compressedJungle = register(new BlockCompressedLog("compressedJungle", Blocks.LOG, 3));
        compressedAcacia = register(new BlockCompressedLog("compressedAcacia", Blocks.LOG2, 0));
        compressedDarkOak = register(new BlockCompressedLog("compressedDarkOak", Blocks.LOG2, 1));

        // Compressed Falling blocks
        compressedGravel = register(new BlockCompressedFalling(Material.SAND, "compressedGravel", Blocks.GRAVEL, SoundType.GROUND));
        compressedSand = register(new BlockCompressedSand("compressedSand", Blocks.SAND, 0));
        compressedRedSand = register(new BlockCompressedSand("compressedRedSand", Blocks.SAND, 1));

        // Others compressed blocks
        compressedDirt = register(new BlockCompressed(Material.GROUND, "compressedDirt", Blocks.DIRT, SoundType.GROUND));
        compressedStone = register(new BlockCompressed(Material.ROCK, "compressedStone", Blocks.STONE, SoundType.STONE));
        compressedCobblestone = register(new BlockCompressed(Material.ROCK, "compressedCobblestone", Blocks.COBBLESTONE, SoundType.STONE));
        compressedSoulSand = register(new BlockCompressed(Material.SAND, "compressedSoulSand", Blocks.SOUL_SAND, SoundType.SAND));
        compressedNetherrack = register(new BlockCompressed(Material.ROCK, "compressedNetherrack", Blocks.NETHERRACK, SoundType.STONE));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
