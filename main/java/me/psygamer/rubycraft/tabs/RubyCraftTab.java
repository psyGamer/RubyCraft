package me.psygamer.rubycraft.tabs;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.List;

import com.google.common.collect.Ordering;

import me.psygamer.rubycraft.init.RubyStuff;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.actors.threadpool.Arrays;

public class RubyCraftTab extends CreativeTabs { 

	//private static List<Item> orderedItems = Arrays.asList(RubyBlocks.RUBY_ORE, RubyItems.RUBY, RubyBlocks.RUBY_BLOCK, RubyItems.RUBY_SWORD, RubyItems.RUBY_AXE, RubyItems.RUBY_PICKAXE, RubyItems.RUBY_SHOVEL, RubyItems.RUBY_HOE, RubyItems.RUBY_HELMET, RubyItems.RUBY_CHESTPLATE, RubyItems.RUBY_LEGGINGS, RubyItems.RUBY_BOOTS, RubyItems.RUBY_APPLE);
	//public static Comparator<ItemStack> tabSorter; 
	
	
	public RubyCraftTab() {
		super("rubycraft");
	}

	/*@Override
	@SideOnly(Side.CLIENT)
	public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		for (int i = 0; i < orderedItems.size(); i++)
		      items.add(orderedItems.get(i)); 
		super.displayAllRelevantItems(items);
	}*/
	
	@Override
	public ItemStack getTabIconItem() {
		return new 	ItemStack(RubyStuff.RUBY);
	}

	
	
}
