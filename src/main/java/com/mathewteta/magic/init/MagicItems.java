package com.mathewteta.magic.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.matthewteta.newblocks.Reference;

public class MagicItems {
	
	public static Item magic_sword;
	
	public static void init() {
		magic_sword = new Item().setUnlocalizedName("magic_sword");
	}
	
	public static void register() {
		GameRegistry.registerItem(magic_sword, magic_sword.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		registerRender(magic_sword);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
