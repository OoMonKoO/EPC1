package epc1.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import epc1.EPC1;
import epc1.reference;

public class ItemIronPickaxe extends ItemPickaxe {
    public ItemIronPickaxe(int i, EnumToolMaterial enumToolMaterial) {
        super(i, enumToolMaterial);
        this.setCreativeTab(EPC1.EPC1CreativeTab);
    }

    // Shiny Effect \\
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }

    // Fire Aspect \\
    // public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving,
    // EntityLiving entityliving1) {
    // entityliving.setFire(5);
    // return true;}

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(reference.MOD_ID + ":"
                + (this.getUnlocalizedName().substring(5)));
    }

    {
    }
}
