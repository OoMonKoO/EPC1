package epc1.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import epc1.EPC1;
import epc1.reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockChromitOre extends Block {

    public BlockChromitOre(int id) {

        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(5F);
        setLightValue(0.2F);
        this.setCreativeTab(EPC1.EPC1CreativeTab);
        this.canSilkHarvest();
    }

    

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(reference.MOD_ID + ":"
                + (this.getUnlocalizedName().substring(5)));

    }

}
