package me.psygamer.rubycraft.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RubyApple extends FoodBase {

	PotionEffect effect1;
	PotionEffect effect2;
	PotionEffect effect3;
	
	public RubyApple(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect1, PotionEffect effect2, PotionEffect effect3) {
		super(name, amount, saturation, isAnimalFood);
		
		setAlwaysEdible();
		
		this.effect1 = effect1;
		this.effect2 = effect2;
		this.effect3 = effect3;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect1.getPotion(), effect1.getDuration(), effect1.getAmplifier(), effect1.getIsAmbient(), effect1.doesShowParticles()));
			player.addPotionEffect(new PotionEffect(effect2.getPotion(), effect2.getDuration(), effect2.getAmplifier(), effect2.getIsAmbient(), effect2.doesShowParticles()));
			player.addPotionEffect(new PotionEffect(effect3.getPotion(), effect3.getDuration(), effect3.getAmplifier(), effect3.getIsAmbient(), effect3.doesShowParticles()));
		}
	}

}
