package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCompressedPlank extends BlockCompressed {

    private int plankMeta;

    public BlockCompressedPlank(String name, String dictName, int plankMeta) {
        super(Material.WOOD, 2.0F, name, dictName, Blocks.PLANKS, SoundType.WOOD);

        this.plankMeta = plankMeta;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return (plankMeta);
    }

    /**
     * Gets the metadata of the block when he is picked.
     */
    @Override
    @Deprecated // Forge: Use more sensitive version below: getPickBlock
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, 0);
    }
}
