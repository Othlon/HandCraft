package othlon.handcraft.tileentities;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by jen on 19/07/2014.
 */
public class HCTileEntities {



    public static void init() {

        GameRegistry.registerTileEntity(TileEntityHCWheel.class, "WheelEntity");

    }

}
