package me.psygamer.rubycraft;

import java.util.List;
import java.util.function.Function;

import com.google.common.collect.Ordering;

import me.psygamer.rubycraft.init.RubyStuff;
import me.psygamer.rubycraft.proxy.CommonProxy;
import me.psygamer.rubycraft.tabs.RubyCraftTab;
import me.psygamer.rubycraft.util.Reference;
import me.psygamer.rubycraft.world.RubyWorldGen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.actors.threadpool.Arrays;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new RubyWorldGen(), 3);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
