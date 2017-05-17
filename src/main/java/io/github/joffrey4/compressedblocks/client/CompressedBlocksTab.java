package io.github.joffrey4.compressedblocks.client;

import io.github.joffrey4.compressedblocks.CompressedBlocksMod;
import io.github.joffrey4.compressedblocks.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CompressedBlocksTab extends CreativeTabs {

    public CompressedBlocksTab() {
        super(CompressedBlocksMod.modId);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.compressedOak);
    }
}
