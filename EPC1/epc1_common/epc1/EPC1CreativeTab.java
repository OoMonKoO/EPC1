package epc1;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EPC1CreativeTab extends CreativeTabs {

    public EPC1CreativeTab(String label) {

        super(label);
    }

    public ItemStack getIconItemStack() {
        return new ItemStack(EPC1.IronPickaxe);
    }
}
