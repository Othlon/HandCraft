// Date: 26/07/2014 1:05:46 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package othlon.handcraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;



class ModelSpinningWheel extends ModelBase
{
  //fields
    ModelRenderer wheel;
    ModelRenderer Shape10;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer pedal_l;
    ModelRenderer pedal_r;
    ModelRenderer Shape8;
    ModelRenderer Shape7;
    ModelRenderer Shape1;
    ModelRenderer shaft;
    ModelRenderer Shape9;
  
  public ModelSpinningWheel()
  {
    textureWidth  = 64;
    textureHeight = 32;

    
      wheel = new ModelRenderer(this, 0, 0);
      wheel.addBox(0F, 0F, 0F, 8, 2, 8);
      wheel.setRotationPoint(-4F, 17F, 4F);
      wheel.setTextureSize(64, 32);
      wheel.mirror = true;
      setRotation(wheel, 1.571209F, 0F, 0F);

      Shape10 = new ModelRenderer(this, 0, 0);
      Shape10.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape10.setRotationPoint(0F, -1F, -2F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);

      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 2, 11);
      Shape4.setRotationPoint(-1F, 22F, -6F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);

      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 2, 1, 8);
      Shape6.setRotationPoint(-1F, 4F, -2F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);

      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 23, 1);
      Shape2.setRotationPoint(-1F, -1F, 6F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);

      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 16, 2, 3);
      Shape3.setRotationPoint(-8F, 22F, 5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);

      pedal_l = new ModelRenderer(this, 0, 0);
      pedal_l.addBox(0F, 0F, 0F, 5, 1, 7);
      pedal_l.setRotationPoint(-7F, 22F, -3F);
      pedal_l.setTextureSize(64, 32);
      pedal_l.mirror = true;
      setRotation(pedal_l, -0.0892287F, 0F, 0F);

      pedal_r = new ModelRenderer(this, 0, 0);
      pedal_r.addBox(0F, 0F, 0F, 5, 1, 7);
      pedal_r.setRotationPoint(2F, 23F, -3F);
      pedal_r.setTextureSize(64, 32);
      pedal_r.mirror = true;
      setRotation(pedal_r, 0.2379431F, 0F, 0F);

      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 10, 1);
      Shape8.setRotationPoint(-1F, 13F, 3F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, -0.0698132F, 0F, 0.3141593F);

      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 10, 1);
      Shape7.setRotationPoint(1F, 12F, 3F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, -0.0349066F, 0F, -0.2617994F);

      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape1.setRotationPoint(-1F, 1.773333F, 3.986667F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 1.570796F, 0F, 0F);

      shaft = new ModelRenderer(this, 0, 0);
      shaft.addBox(0F, 0F, 0F, 1, 3, 1);
      shaft.setRotationPoint(-0.3733333F, 1.2F, 1F);
      shaft.setTextureSize(64, 32);
      shaft.mirror = true;
      setRotation(shaft, 1.570796F, 0F, 0F);

      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape9.setRotationPoint(-1F, 1.8F, 0F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 1.570796F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    wheel.render(f5);
    Shape10.render(f5);
    Shape4.render(f5);
    Shape6.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    pedal_l.render(f5);
    pedal_r.render(f5);
    Shape8.render(f5);
    Shape7.render(f5);
    Shape1.render(f5);
    shaft.render(f5);
    Shape9.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
