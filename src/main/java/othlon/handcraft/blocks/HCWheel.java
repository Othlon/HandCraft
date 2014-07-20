package othlon.handcraft.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import othlon.handcraft.tileentities.TileEntityHCWheel;

/**
 * Created by jen on 19/07/2014.
 */
public class HCWheel extends BlockContainer {


  public HCWheel() {

      super(Material.piston);
      this.setHarvestLevel("axe", 0);
      this.setBlockName("Spinning Wheel");
      this.setCreativeTab(CreativeTabs.tabFood);
      this.setHardness(2.0f);
      this.setResistance(5.0f);


  }


    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntityHCWheel();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }


}
