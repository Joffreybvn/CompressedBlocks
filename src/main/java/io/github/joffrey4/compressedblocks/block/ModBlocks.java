package io.github.joffrey4.compressedblocks.block;

import io.github.joffrey4.compressedblocks.item.ItemOreDict;
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

    // Compressed Planks
    public static BlockCompressedPlank compressedOakPlank;
    public static BlockCompressedPlank compressedSprucePlank;
    public static BlockCompressedPlank compressedBirchPlank;
    public static BlockCompressedPlank compressedJunglePlank;
    public static BlockCompressedPlank compressedAcaciaPlank;
    public static BlockCompressedPlank compressedDarkOakPlank;

    // Compressed Falling blocks
    public static BlockCompressedFalling compressedGravel;
    public static BlockCompressedSand compressedSand;
    public static BlockCompressedSand compressedRedSand;

    // Compressed Stone blocks
    public static BlockCompressed compressedStone;
    public static BlockCompressedStone compressedGranite;
    public static BlockCompressedStone compressedDiorite;
    public static BlockCompressedStone compressedAndesite;

    // Others compressed blocks
    public static BlockCompressed compressedDirt;
    public static BlockCompressed compressedCobblestone;
    public static BlockCompressed compressedSoulSand;
    public static BlockCompressed compressedNetherrack;

    public static void init() {

        // Compressed Woods
        compressedOak = register(new BlockCompressedLog("compressedOak", "compressed1xOak", Blocks.LOG, 0));
        compressedSpruce = register(new BlockCompressedLog("compressedSpruce", "compressed1xSpruce", Blocks.LOG, 1));
        compressedBirch = register(new BlockCompressedLog("compressedBirch", "compressed1xBirch", Blocks.LOG, 2));
        compressedJungle = register(new BlockCompressedLog("compressedJungle", "compressed1xJungle", Blocks.LOG, 3));
        compressedAcacia = register(new BlockCompressedLog("compressedAcacia", "compressed1xAcacia", Blocks.LOG2, 0));
        compressedDarkOak = register(new BlockCompressedLog("compressedDarkOak", "compressed1xDarkOak", Blocks.LOG2, 1));

        // Compressed Planks
        compressedOakPlank = register(new BlockCompressedPlank("compressedOakPlank", "compressed1xOakPlank", 0));
        compressedSprucePlank = register(new BlockCompressedPlank("compressedSprucePlank", "compressed1xSprucePlank", 1));
        compressedBirchPlank = register(new BlockCompressedPlank("compressedBirchPlank", "compressed1xBirchPlank", 2));
        compressedJunglePlank = register(new BlockCompressedPlank("compressedJunglePlank", "compressed1xJunglePlank", 3));
        compressedAcaciaPlank = register(new BlockCompressedPlank("compressedAcaciaPlank", "compressed1xAcaciaPlank", 4));
        compressedDarkOakPlank = register(new BlockCompressedPlank("compressedDarkOakPlank", "compressed1xDarkOakPlank", 5));

        // Compressed Falling blocks
        compressedGravel = register(new BlockCompressedFalling(Material.SAND, "compressedGravel", "compressed1xGravel", Blocks.GRAVEL, SoundType.GROUND));
        compressedSand = register(new BlockCompressedSand("compressedSand", "compressed1xSand", Blocks.SAND, 0));
        compressedRedSand = register(new BlockCompressedSand("compressedRedSand", "compressed1xRedSand", Blocks.SAND, 1));

        // Compressed Stone blocks
        compressedStone = register(new BlockCompressed(Material.ROCK, "compressedStone", "compressed1xStone", Blocks.COBBLESTONE, SoundType.STONE));
        compressedGranite = register(new BlockCompressedStone("compressedGranite", "compressed1xGranite", 1));
        compressedDiorite = register(new BlockCompressedStone("compressedDiorite", "compressed1xDiorite", 3));
        compressedAndesite = register(new BlockCompressedStone("compressedAndesite", "compressed1xAndesite", 5));

        // Others compressed blocks
        compressedDirt = register(new BlockCompressed(Material.GROUND, "compressedDirt", "compressed1xDirt", Blocks.DIRT, SoundType.GROUND));
        compressedCobblestone = register(new BlockCompressed(Material.ROCK, "compressedCobblestone", "compressed1xCobblestone", Blocks.COBBLESTONE, SoundType.STONE));
        compressedSoulSand = register(new BlockCompressed(Material.SAND, "compressedSoulSand", "compressed1xSoulsand", Blocks.SOUL_SAND, SoundType.SAND));
        compressedNetherrack = register(new BlockCompressed(Material.ROCK, "compressedNetherrack", "compressed1xNetherrack", Blocks.NETHERRACK, SoundType.STONE));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if (itemBlock != null) {
            GameRegistry.register(itemBlock);

            if (block instanceof ItemOreDict) {
                ((ItemOreDict)block).initOreDict();
            }
            if (itemBlock instanceof ItemOreDict) {
                ((ItemOreDict)itemBlock).initOreDict();
            }
            if (block instanceof BlockBase) {
                ((BlockBase)block).registerItemModel(itemBlock);
            }
        }
        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
