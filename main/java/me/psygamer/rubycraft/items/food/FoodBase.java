package me.psygamer.rubycraft.items.food;

import me.psygamer.rubycraft.Main;
import me.psygamer.rubycraft.init.RubyStuff;
import me.psygamer.rubycraft.tabs.RubyTabs;
import me.psygamer.rubycraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class FoodBase extends ItemFood implements IHasModel {
	
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
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
