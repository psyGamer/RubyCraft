package me.psygamer.rubycraft.items.tools;

import me.psygamer.rubycraft.Main;
import me.psygamer.rubycraft.init.RubyStuff;
import me.psygamer.rubycraft.tabs.RubyTabs;
import me.psygamer.rubycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel {

	public ToolAxe(String name, ToolMaterial material) {
		super(material, 6.0F, -3.2F);
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
