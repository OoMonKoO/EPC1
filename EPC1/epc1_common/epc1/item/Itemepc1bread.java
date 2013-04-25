package epc1.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import epc1.EPC1;
import epc1.reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class Itemepc1bread extends ItemFood

{

    public Itemepc1bread(int id, int healAmount, float sat, boolean isWolfMeat) {
        super(id, healAmount, sat, isWolfMeat);
        this.setCreativeTab(EPC1.EPC1CreativeTab);
        this.setAlwaysEdible();
        this.setPotionEffect(Potion.regeneration.id, 150, 2, 1.0F);

    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(reference.MOD_ID + ":"
                + (this.getUnlocalizedName().substring(5)));

    }

    {

    }
}
