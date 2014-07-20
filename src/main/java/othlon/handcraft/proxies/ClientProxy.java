package othlon.handcraft.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import othlon.handcraft.client.render.HCRenderWheel;
import othlon.handcraft.tileentities.TileEntityHCWheel;

/**
 * Created by jen on 19/07/2014.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers(){

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHCWheel.class, new HCRenderWheel());

    }
}
