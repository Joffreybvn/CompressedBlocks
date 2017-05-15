package io.github.joffrey4.compressedblocks;

import io.github.joffrey4.compressedblocks.block.ModBlocks;
import io.github.joffrey4.compressedblocks.client.CompressedBlocksTab;
import io.github.joffrey4.compressedblocks.proxy.CommonProxy;
import io.github.joffrey4.compressedblocks.recipes.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CompressedBlocksMod.modId, name = CompressedBlocksMod.name, version = CompressedBlocksMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class CompressedBlocksMod {

    @SidedProxy(serverSide = "io.github.joffrey4.compressedblocks.proxy.CommonProxy", clientSide = "io.github.joffrey4.compressedblocks.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final String modId = "compressedblocks";
    public static final String name = "Compressed Blocks";
    public static final String version = "1.1.0";

    public static final CompressedBlocksTab creativeTab = new CompressedBlocksTab();

    @Mod.Instance(modId)
    public static CompressedBlocksMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}
