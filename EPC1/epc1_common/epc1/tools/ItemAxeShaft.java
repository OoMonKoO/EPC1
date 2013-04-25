package epc1.tools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import epc1.EPC1;
import epc1.reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemAxeShaft extends Item {
    public ItemAxeShaft(int id) {
        super(id);
        this.setCreativeTab(EPC1.EPC1CreativeTab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(reference.MOD_ID + ":"
                + (this.getUnlocalizedName().substring(5)));
    }

    {
    }
}
