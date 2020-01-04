package me.psygamer.rubycraft.items;

import me.psygamer.rubycraft.Main;
import me.psygamer.rubycraft.init.RubyStuff;
import me.psygamer.rubycraft.tabs.RubyTabs;
import me.psygamer.rubycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(RubyTabs.tab);
		
		RubyStuff.ITEMS.add(this);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
