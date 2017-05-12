package io.github.joffrey4.compressedblocks.block;

import io.github.joffrey4.compressedblocks.CompressedBlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockCompressed extends BlockBase {

    protected Block droppedBlock;

    public BlockCompressed(Material material, String name, Block droppedBlock, SoundType soundType) {
        super(material, name);

        this.droppedBlock = droppedBlock;

        setHardness(4.0F);
        setResistance(4.0F);
        setSoundType(soundType);
        setCreativeTab(CompressedBlocksMod.creativeTab);
    }

    public int quantityDropped(Random random)
    {
        return 4 + random.nextInt(5);
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(droppedBlock);
    }

}
