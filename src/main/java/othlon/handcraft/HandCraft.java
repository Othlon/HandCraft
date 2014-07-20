package othlon.handcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import othlon.handcraft.blocks.HCBlocks;
import othlon.handcraft.proxies.CommonProxy;
import othlon.handcraft.tileentities.HCTileEntities;

/**
 * Created by jen on 19/07/2014.
 */

@Mod(modid = HandCraft.MODID, name = HandCraft.MODNAME, version = HandCraft.VERSION)
public class HandCraft {

    public static final String MODID   = "HandCraft";
    public static final String MODNAME = "HandCraft";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "othlon.handcraft.proxies.ClientProxy", serverSide = "othlon.handcraft.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit( FMLPreInitializationEvent event){

        HCBlocks.init();
        HCTileEntities.init();
        proxy.registerRenderers();


    }//preinit

}
