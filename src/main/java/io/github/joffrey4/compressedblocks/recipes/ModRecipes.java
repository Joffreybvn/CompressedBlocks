package io.github.joffrey4.compressedblocks.recipes;

import io.github.joffrey4.compressedblocks.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {

        /*************************************************************************************************
         * Compressed WOODS - Recipes                                                                    *
         *************************************************************************************************/

        // Oak Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedOak), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9, 0), ModBlocks.compressedOak);

        // Spruce Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedSpruce), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9, 1), ModBlocks.compressedSpruce);

        // Birch Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedBirch), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9, 2), ModBlocks.compressedBirch);

        // Jungle Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedJungle), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 9, 3), ModBlocks.compressedJungle);

        // Acacia Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedAcacia), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG2, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 9, 0), ModBlocks.compressedAcacia);

        // Dark Oak Wood compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedDarkOak), "LLL", "LLL", "LLL", 'L', new ItemStack(Blocks.LOG2, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 9, 1), ModBlocks.compressedDarkOak);

        /*************************************************************************************************
         * Compressed PLANKS - Recipes                                                                   *
         *************************************************************************************************/

        // Oak Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedOakPlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 0), ModBlocks.compressedOakPlank);

        // Spruce Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedSprucePlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 1), ModBlocks.compressedSprucePlank);

        // Birch Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedBirchPlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 2));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 2), ModBlocks.compressedBirchPlank);

        // Jungle Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedJunglePlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 3), ModBlocks.compressedJunglePlank);

        // Acacia Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedAcaciaPlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 4), ModBlocks.compressedAcaciaPlank);

        // Dark Oak Plank compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedDarkOakPlank), "PPP", "PPP", "PPP", 'P', new ItemStack(Blocks.PLANKS, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PLANKS, 9, 5), ModBlocks.compressedDarkOakPlank);

        /*************************************************************************************************
         * Compressed FALLING BLOCKS - Recipes                                                           *
         *************************************************************************************************/

        // Gravel compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedGravel), "GGG", "GGG", "GGG", 'G', Blocks.GRAVEL);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.GRAVEL, 9), ModBlocks.compressedGravel);

        // Sand compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedSand), "SSS", "SSS", "SSS", 'S', new ItemStack(Blocks.SAND, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 9, 0), ModBlocks.compressedSand);

        // Red Sand compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedRedSand), "RRR", "RRR", "RRR", 'R', new ItemStack(Blocks.SAND, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SAND, 9, 1), ModBlocks.compressedRedSand);

        /*************************************************************************************************
         * Compressed STONE BLOCKS - Recipes                                                             *
         *************************************************************************************************/

        // Stone compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedStone), "SSS", "SSS", "SSS", 'S', new ItemStack(Blocks.STONE, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 9, 0), ModBlocks.compressedStone);

        // Granite compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedGranite), "SSS", "SSS", "SSS", 'S', new ItemStack(Blocks.STONE, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 9, 1), ModBlocks.compressedGranite);

        // Diorite compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedDiorite), "SSS", "SSS", "SSS", 'S', new ItemStack(Blocks.STONE, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 9, 3), ModBlocks.compressedDiorite);

        // Andesite compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedAndesite), "SSS", "SSS", "SSS", 'S', new ItemStack(Blocks.STONE, 1, 5));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.STONE, 9, 5), ModBlocks.compressedAndesite);

        /*************************************************************************************************
         * Compressed OTHER BLOCKS - Recipes                                                             *
         *************************************************************************************************/

        // Dirt compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedDirt), "DDD", "DDD", "DDD", 'D', Blocks.DIRT);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 9), ModBlocks.compressedDirt);

        // Cobblestone compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedCobblestone), "CCC", "CCC", "CCC", 'C', Blocks.COBBLESTONE);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 9), ModBlocks.compressedCobblestone);

        // Soul Sand compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedSoulSand), "SSS", "SSS", "SSS", 'S', Blocks.SOUL_SAND);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SOUL_SAND, 9), ModBlocks.compressedSoulSand);

        // Netherrack compressing and uncompressing
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.compressedNetherrack), "NNN", "NNN", "NNN", 'N', Blocks.NETHERRACK);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHERRACK, 9), ModBlocks.compressedNetherrack);
    }

}