package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCompressedGravel extends BlockCompressedFalling {

    public BlockCompressedGravel(String name, String dictName) {
        super(Material.SAND, 0.6F, name, dictName, Blocks.GRAVEL, SoundType.GROUND);
    }

    @SideOnly(Side.CLIENT)
    public int getDustColor(IBlockState p_189876_1_)
    {
        return -8356741;
    }
}
