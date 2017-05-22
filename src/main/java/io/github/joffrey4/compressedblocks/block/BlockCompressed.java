package io.github.joffrey4.compressedblocks.block;

import io.github.joffrey4.compressedblocks.CompressedBlocksMod;
import io.github.joffrey4.compressedblocks.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockCompressed extends BlockBase implements ItemOreDict {

    private Block droppedBlock;
    private String dictName;

    public BlockCompressed(Material material, float hardness, String name, String dictName, Block droppedBlock, SoundType soundType) {
        super(material, name);

        this.droppedBlock = droppedBlock;
        this.dictName = dictName;

        setHardness(hardness);
        setResistance(2.0F);
        setSoundType(soundType);
        setCreativeTab(CompressedBlocksMod.creativeTab);
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(dictName, this);
    }

    @Override
    public int quantityDropped(Random random)
    {
        return 5 + random.nextInt(5);
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(droppedBlock);
    }

    /**
     * Return meta 0 when the block is picked.
     */
    @Override
    @Deprecated // Forge: Use more sensitive version below: getPickBlock
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, 0);
    }

}
