package epc1;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import epc1.blocks.BlockChromitOre;
import net.minecraft.block.*;

@Mod(modid = reference.MOD_ID, name = reference.MOD_NAME, version = reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class EPC1 {

    public static CreativeTabs EPC1CreativeTab = new EPC1CreativeTab(
            "epc1creativetab");

    public static Item epc1bread;
    public static Item Flour;
    public static Item Breaddough;
    public static Item IronPickaxe;
    public static Item AxeShaft;
    public static Item ChromitCrystal;
    public static Item Chromit;
    public static Item ChromeShovel;
    public static Item ChromeAxe;

    public static Block ChromitOre;

    int epc1breadID = 6998;
    int FlourID = 6999;
    int BreaddoughID = 7000;
    int IronPickaxeID = 7001;
    int AxeShaftID = 7002;
    int ChromitOreID = 888;
    int ChromitCrystalID = 6997;
    int ChromitID = 6996;
    int ChromeShovelID = 6995;
    int ChromeAxeID = 6994;

    public static EnumToolMaterial Chrome = EnumHelper.addToolMaterial(
            "Chrome", 4, 501, 10F, 4, 22);

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(
                event.getSuggestedConfigurationFile());

        epc1breadID = config.get("ItemIDs", "EPC1 Bread ID", 6998).getInt();
        FlourID = config.get("ItemIDs", "Flour ID", 6999).getInt();
        BreaddoughID = config.get("ItemIDs", "Breaddough ID", 7000).getInt();

        IronPickaxeID = config.get("ItemIDs", "IronPickaxe ID", 7001).getInt();
        AxeShaftID = config.get("ItemIDs", "AxeShaft ID", 7002).getInt();
        ChromitOreID = config.get("BlockIDs", "ChromitOre ID", 888).getInt();
        ChromitCrystalID = config.get("ItemIDs", "ChromitCrystal ID", 6997)
                .getInt();
        ChromitID = config.get("ItemIDs", "Chromit ID", 6996).getInt();
        ChromeShovelID = config.get("ItemIDs", "ChromeShovel ID", 6995)
                .getInt();
        ChromeAxeID = config.get("ItemIDs", "ChromeAxe ID", 6994).getInt();

        config.save();
    }

    @SidedProxy(clientSide = "epc1.client.ClientProxy", serverSide = "epc1.CommonProxyEPC1")
    public static CommonProxyEPC1 proxy;

    @Init
    public void load(FMLInitializationEvent event) {
        // proxy.registerRenderThings();

        // Creative Tab \\
        LanguageRegistry.instance().addStringLocalization(
                "itemGroup.epc1creativetab", "en_US",
                "Enhanced Production Chains");

        // Items FOOD \\
        epc1bread = new epc1.item.Itemepc1bread(epc1breadID, 8, 2.0F, false)
                .setUnlocalizedName("epc1bread");

        Flour = new epc1.item.ItemFlour(FlourID).setUnlocalizedName("Flour");

        Breaddough = new epc1.item.ItemBreaddough(BreaddoughID)
                .setUnlocalizedName("Bread Dough");

        // Item TOOLS \\
        IronPickaxe = new epc1.tools.ItemIronPickaxe(IronPickaxeID, Chrome)
                .setUnlocalizedName("Chrome Pickaxe");
        AxeShaft = new epc1.tools.ItemAxeShaft(AxeShaftID)
                .setUnlocalizedName("Tool Shaft");
        ChromitCrystal = new epc1.item.ItemChromitCrystal(ChromitCrystalID)
                .setUnlocalizedName("Chromit Crystal");
        Chromit = new epc1.item.ItemChromit(ChromitID)
                .setUnlocalizedName("Chrome");
        ChromeShovel = new epc1.tools.ItemChromeShovel(ChromeShovelID, Chrome)
                .setUnlocalizedName("Chrome Shovel");
        ChromeAxe = new epc1.tools.ItemChromeAxe(ChromeAxeID, Chrome)
                .setUnlocalizedName("Chrome Axe");

        // BLOCKS \\
        ChromitOre = new BlockChromitOre(ChromitOreID)
                .setUnlocalizedName("ChromitOre");
        // Game Registers \\

        GameRegistry.registerBlock(ChromitOre, "Chrome");
        GameRegistry.registerItem(IronPickaxe, "Iron PickAxe");
        GameRegistry.registerItem(AxeShaft, "Axe Shaft");

        // Language Registers \\
        LanguageRegistry.addName(epc1bread, "Bread");
        LanguageRegistry.addName(Flour, "Plain Flour");
        LanguageRegistry.addName(Breaddough, "Bread Dough");
        LanguageRegistry.addName(IronPickaxe, "Chrome Pickaxe");
        LanguageRegistry.addName(AxeShaft, "Tool Shaft");
        LanguageRegistry.addName(ChromitOre, "Chromit");
        LanguageRegistry.addName(ChromitCrystal, "Chromit Crystal");
        LanguageRegistry.addName(Chromit, "Chrome");
        LanguageRegistry.addName(ChromeShovel, "Chrome Shovel");
        LanguageRegistry.addName(ChromeAxe, "Chrome Axe");

        Recipes.addRecipes();

        MinecraftForge.setBlockHarvestLevel(ChromitOre, "pickaxe", 2);
        MinecraftForge.setToolClass(IronPickaxe, "Chrome Pickaxe", 4);
        MinecraftForge.setToolClass(ChromeShovel, "Chrome Shovel", 4);
        MinecraftForge.setToolClass(ChromeAxe, "Chrome Axe", 4);

        // WorldGen \\
        GameRegistry.registerWorldGenerator(new WorldGeneratorEPC1());

        {
        }
    }

}
