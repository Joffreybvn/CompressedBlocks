package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCompressedSand extends BlockCompressedFalling {

    private int logMeta;

    public BlockCompressedSand(String name, String dictName, int logMeta) {
        super(Material.SAND, 0.5F, name, dictName, Blocks.SAND, SoundType.SAND);

        this.logMeta = logMeta;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return (logMeta);
    }
}
