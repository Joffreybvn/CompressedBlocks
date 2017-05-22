package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCompressedStone extends BlockCompressed {

    private int stoneMeta;

    public BlockCompressedStone(String name, String dictName, int stoneMeta) {
        super(Material.ROCK, 1.5F, name, dictName, Blocks.STONE, SoundType.STONE);

        this.stoneMeta = stoneMeta;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return (stoneMeta);
    }
}
