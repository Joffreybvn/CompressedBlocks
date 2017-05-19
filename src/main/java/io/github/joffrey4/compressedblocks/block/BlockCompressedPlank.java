package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCompressedPlank extends BlockCompressed {

    private int plankMeta;

    public BlockCompressedPlank(String name, String dictName, Block droppedBlock, int plankMeta) {
        super(Material.WOOD, name, dictName, droppedBlock, SoundType.WOOD);

        this.plankMeta = plankMeta;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return (plankMeta);
    }
}
