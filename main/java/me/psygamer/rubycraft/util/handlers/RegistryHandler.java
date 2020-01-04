package me.psygamer.rubycraft.util.handlers;

import me.psygamer.rubycraft.init.RubyStuff;
import me.psygamer.rubycraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(RubyStuff.ITEMS.toArray(new Item[0]));;
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(RubyStuff.BLOCKS.toArray(new Block[0]));;
	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : RubyStuff.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModel();
			}
		}
		
		for(Block block : RubyStuff.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModel();
			}
		}
	}
}
