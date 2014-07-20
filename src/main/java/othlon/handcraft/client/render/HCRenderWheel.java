package othlon.handcraft.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

/**
 * Created by jen on 19/07/2014.
 */
public class HCRenderWheel extends TileEntitySpecialRenderer {

    private static IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation("handcraft:models/spinningwheel.tcn"));

    public void renderTileEntityAt(TileEntity tileEntity, double v, double v2, double v3, float v4) {

        GL11.glPushMatrix();

        GL11.glTranslatef((float)v + 0.5F, (float)v2 + 0.0F, (float)v3+ 0.5F);

        GL11.glScaled( 1.0/16 ,-1.0/16, 1.0/16 );

        GL11.glColor4d(1, 1, 1, 1);


        FMLClientHandler.instance().getClient().getTextureManager().bindTexture(new ResourceLocation("handcraft:textures/SpinningWheel.png"));
        model.renderAll();

        GL11.glPopMatrix();


    }


}
