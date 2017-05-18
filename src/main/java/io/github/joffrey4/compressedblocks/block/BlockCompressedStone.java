package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class BlockCompressedStone extends BlockCompressed {

    private int stoneMeta;

    public BlockCompressedStone(String name, int stoneMeta) {
        super(Material.ROCK, name, Blocks.STONE, SoundType.STONE);

        this.stoneMeta = stoneMeta;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return (stoneMeta);
    }
}
