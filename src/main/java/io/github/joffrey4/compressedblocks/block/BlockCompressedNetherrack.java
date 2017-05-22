package io.github.joffrey4.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCompressedNetherrack extends BlockCompressed {

    public BlockCompressedNetherrack(String name, String dictName) {
        super(Material.ROCK, 0.4F, name, dictName,  Blocks.NETHERRACK, SoundType.STONE);
    }

    @Override
    public boolean isFireSource(World world, BlockPos pos, EnumFacing side) {
        return side == EnumFacing.UP;
    }
}
