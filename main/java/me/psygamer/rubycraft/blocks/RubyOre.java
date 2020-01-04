package me.psygamer.rubycraft.blocks;

import java.util.Random;

import me.psygamer.rubycraft.init.RubyStuff;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase {
	
	public RubyOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RubyStuff.RUBY;
	}
	@Override
	public int quantityDropped(Random rand) {
		int min = 1;
		int max = 4;
		return rand.nextInt(max) + min;
	}
}
