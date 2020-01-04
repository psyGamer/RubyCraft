package me.psygamer.rubycraft.init;

import java.util.ArrayList;
import java.util.List;

import me.psygamer.rubycraft.blocks.BlockBase;
import me.psygamer.rubycraft.blocks.RubyOre;
import me.psygamer.rubycraft.items.ItemBase;
import me.psygamer.rubycraft.items.armor.ArmorBase;
import me.psygamer.rubycraft.items.food.FoodBase;
import me.psygamer.rubycraft.items.food.FoodEffectBase;
import me.psygamer.rubycraft.items.food.RubyApple;
import me.psygamer.rubycraft.items.tools.ToolAxe;
import me.psygamer.rubycraft.items.tools.ToolHoe;
import me.psygamer.rubycraft.items.tools.ToolPickaxe;
import me.psygamer.rubycraft.items.tools.ToolSpade;
import me.psygamer.rubycraft.items.tools.ToolSword;
import me.psygamer.rubycraft.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class RubyStuff {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 512, 12.0F, 6.0F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 22, new int[] {5, 8, 11, 5}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	
	// Ruby Ore
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	
	// Ruby Item
	public static final Item RUBY = new ItemBase("ruby");
	
	// Ruby Block
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	
	// Ruby Tools 
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	// Ruby Apple
	public static final Item RUBY_APPLE = new RubyApple("ruby_apple", 6, 3, false, new PotionEffect(MobEffects.HEALTH_BOOST, 400, 4, false, true), new PotionEffect(MobEffects.REGENERATION, 100, 4, false, true), new PotionEffect(MobEffects.RESISTANCE, 200, 4, false, true));
	
	// Ruby Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
}
