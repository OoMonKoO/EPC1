package epc1;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
public class Recipes {

    public static void addRecipes() {

        // Crafting FOOD \\
        GameRegistry.addRecipe(new ItemStack(EPC1.Flour, 10), new Object[] {
                "ZZZ", "XCX", "XCX", 'X', Item.wheat, 'C', Item.seeds, 'Z',
                Block.stone });

        GameRegistry.addShapelessRecipe(new ItemStack(EPC1.Breaddough, 1),
                new Object[] { new ItemStack(EPC1.Flour),
                        new ItemStack(Item.egg), new ItemStack(Item.sugar) });

        // Crafting TOOLS \\
        GameRegistry.addRecipe(new ItemStack(Block.woodSingleSlab, 12),
                new Object[] { "WWA", 'W', Block.wood, 'A', Item.axeWood });

        GameRegistry.addRecipe(new ItemStack(Item.stick, 16), new Object[] {
                "SSA", 'S', Block.woodSingleSlab, 'A', Item.axeWood });

        GameRegistry.addRecipe(new ItemStack(EPC1.AxeShaft, 1), new Object[] {
                "SS ", "SS ", "SS ", 'S', Item.stick });

        GameRegistry.addRecipe(new ItemStack(EPC1.IronPickaxe, 1),
                new Object[] { " SS", " XS", "X  ", 'S', EPC1.Chromit, 'X',
                        EPC1.AxeShaft });

        GameRegistry.addRecipe(new ItemStack(EPC1.ChromeShovel, 1),
                new Object[] { " S ", "SXS", " X ", 'S', EPC1.Chromit, 'X',
                        EPC1.AxeShaft });
        
        GameRegistry.addRecipe(new ItemStack(EPC1.ChromeAxe, 1), new Object[] {
            "SS ", " X ", " X ", 'S', EPC1.Chromit, 'X', EPC1.AxeShaft });
        

        // Smelting \\
        GameRegistry.addSmelting(EPC1.Breaddough.itemID, new ItemStack(
                EPC1.epc1bread, 1), 1.0F);

        GameRegistry.addSmelting(EPC1.ChromitOre.blockID, new ItemStack(
                EPC1.ChromitCrystal, 2), 1.0F);

        GameRegistry.addSmelting(EPC1.ChromitCrystal.itemID, new ItemStack(
                EPC1.Chromit, 1), 1.0F);

    }
}
