package othlon.handcraft.blocks;

/**
 * Created by jen on 19/07/2014.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class HCBlocks {

    public static Block spinningWheel;

    public static void init()
    {

        spinningWheel = new HCWheel();
        GameRegistry.registerBlock(spinningWheel,"HandCraft:SpinningWheel");
    }
}
