package com.Egietje.degeweldigemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CheeseCraftingAndSmelting {
	
	public CheeseCraftingAndSmelting() {
		register();
	}
	
	private void register() {
		GameRegistry.addRecipe(new ItemStack(CheeseBlocks.CHEESE_BLOCK), new Object[]{"CCC","CCC","CCC",'C',CheeseItems.CHEESE});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.BREAD_CHEESE), new Object[]{" B "," C "," B ",'C',CheeseItems.CHEESE,'B',Items.BREAD});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE, 9), new Object[]{"C",'C',CheeseBlocks.CHEESE_BLOCK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_APPLE), new Object[]{" C ","CAC"," C ",'C',CheeseItems.CHEESE,'A',Items.APPLE});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SEEDS), new Object[]{" C ","CSC"," C ",'C',CheeseItems.CHEESE,'S',Items.WHEAT_SEEDS});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_INGOT), new Object[]{"CCC","CCC",'C',CheeseItems.CHEESE});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_ARROW), new Object[]{"C","S","F",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK,'F',Items.FEATHER});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SWORD), new Object[]{" C "," C "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SHOVEL), new Object[]{" C "," S "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_AXE), new Object[]{"CC ","CS "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_PICKAXE), new Object[]{"CCC"," S "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_HOE), new Object[]{"CC "," S "," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_FLY_STICK), new Object[]{"CCC","CSC"," S ",'C',CheeseItems.CHEESE_INGOT,'S',Items.STICK});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_FLY_STICK), new Object[]{"SAP"," T "," T ",'S',CheeseItems.CHEESE_SHOVEL_HEAD,'A',CheeseItems.CHEESE_AXE_HEAD,'P',CheeseItems.CHEESE_PICKAXE_HEAD,'T',Items.STICK});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_SHOVEL_HEAD), new Object[]{" C ",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_AXE_HEAD), new Object[]{"CC ","C  ",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_PICKAXE_HEAD), new Object[]{"CCC",'C',CheeseItems.CHEESE_INGOT});
		
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_HELMET), new Object[]{"CCC","C C",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_CHESTPLATE), new Object[]{"C C","CCC","CCC",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_LEGGINGS), new Object[]{"CCC","C C","C C",'C',CheeseItems.CHEESE_INGOT});
		GameRegistry.addRecipe(new ItemStack(CheeseItems.CHEESE_BOOTS), new Object[]{"C C","C C",'C',CheeseItems.CHEESE_INGOT});
		
		GameRegistry.addSmelting(CheeseItems.CHEESE, new ItemStack(CheeseItems.CHEESE_COOKED), 4.2F);
	}
}
