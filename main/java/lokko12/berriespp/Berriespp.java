package lokko12.berriespp;

import lokko12.Proxies.*;
import lokko12.berriespp.crops.BoP.BoPBerryCrop;
//TC Berries
import lokko12.berriespp.crops.TC.AluminiumOreBerryCrop;
import lokko12.berriespp.crops.TC.CopperOreBerryCrop;
import lokko12.berriespp.crops.TC.EssenceOreBerryCrop;
import lokko12.berriespp.crops.TC.GoldOreBerryCrop;
import lokko12.berriespp.crops.TC.IronOreBerryCrop;
import lokko12.berriespp.crops.TC.TinOreBerryCrop;
//Natura Berries
import lokko12.berriespp.crops.natura.BlackberryCrop;
import lokko12.berriespp.crops.natura.BlightberryCrop;
import lokko12.berriespp.crops.natura.BlueberryCrop;
import lokko12.berriespp.crops.natura.DuskberryCrop;
import lokko12.berriespp.crops.natura.MaloberryCrop;
import lokko12.berriespp.crops.natura.RaspberryCrop;
import lokko12.berriespp.crops.natura.SkyberryCrop;
import lokko12.berriespp.crops.natura.StingberryCrop;
//cfg
import lokko12.croploadcore.CropLoader;
import lokko12.croploadcore.config;

import mods.natura.common.NContent;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.common.*;
import net.minecraftforge.common.config.Configuration;
import tconstruct.world.TinkerWorld;
import net.minecraft.item.ItemStack;

@Mod(
	modid = "berriespp", name = "Berries++", version = "F-0.0.4",
	dependencies = "required-after:IC2; after:Mantle; after:Natura; after:TConstruct; after:BiomesOPlenty"
	)

public class Berriespp {

	@Instance(value = "Berries++")
	public static Berriespp instance;
	
	//Checks which mods are aviable
	public static boolean IC2Installed = false;
	public static boolean NaturaInstalled = false;
	public static boolean TConstructInstalled = false;
	public static boolean BoPInstalled = false;
	
	//Loader
	
	//OW Berrys Natura
	public CropLoader cropMaloberryL;
	public CropLoader cropBlackberryL;
	public CropLoader cropBlueberryL;
	public CropLoader cropRaspberryL;
	
	//Nether Berrys Natura
	public CropLoader cropBlightberryL;
	public CropLoader cropSkyberryL;
	public CropLoader cropStingberryL;
	public CropLoader cropDuskberryL;
	
	//TC 
	public CropLoader cropIronOreBerryL;
	public CropLoader cropGoldOreBerryL;
	public CropLoader cropCopperOreBerryL;
	public CropLoader cropTinOreBerryL;
	public CropLoader cropAluminiumOreBerryL;
	public CropLoader cropEssenceOreBerryL;
	
	//BoP
	public CropLoader BoPBerryL;
	
	// public CropLoader NameOfCropL;

	@SidedProxy(clientSide = "lokko12.Proxies.ClientProxy", serverSide = "lokko12.Proxies.Proxy")
	public static Proxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent preinit) {

		//OW Berrys Natura
		cropMaloberryL = new CropLoader(new MaloberryCrop());
		cropBlueberryL = new CropLoader(new BlueberryCrop());
		cropBlackberryL = new CropLoader(new BlackberryCrop());
		cropRaspberryL = new CropLoader(new RaspberryCrop());
		
		//Nether Berrys Natura
		cropBlightberryL = new CropLoader(new BlightberryCrop());
		cropSkyberryL = new CropLoader(new SkyberryCrop());
		cropStingberryL = new CropLoader(new StingberryCrop());
		cropDuskberryL = new CropLoader(new DuskberryCrop());
		
		//TC
		
		cropIronOreBerryL = new CropLoader(new IronOreBerryCrop());
		cropGoldOreBerryL = new CropLoader(new GoldOreBerryCrop());
		cropCopperOreBerryL = new CropLoader(new CopperOreBerryCrop());
		cropTinOreBerryL = new CropLoader(new TinOreBerryCrop());
		cropAluminiumOreBerryL = new CropLoader(new AluminiumOreBerryCrop());
		cropEssenceOreBerryL = new CropLoader(new EssenceOreBerryCrop());
		
		//BoP
		BoPBerryL = new CropLoader(new BoPBerryCrop());
		
		config c = new config(preinit, "berriespp.cfg");
		
		//OW Berrys Natura
		cropMaloberryL.load(c.tConfig, "MaloberryCrop");
		cropBlueberryL.load(c.tConfig, "BlueberryCrop");
		cropBlackberryL.load(c.tConfig, "BlackberryCrop");
		cropRaspberryL.load(c.tConfig, "RaspberryCrop");
		
		//Nether Berrys Natura
		cropBlightberryL.load(c.tConfig, "BlightberryCrop");
		cropSkyberryL.load(c.tConfig, "SkyberryCrop");
		cropStingberryL.load(c.tConfig, "StingberryCrop");
		cropDuskberryL.load(c.tConfig, "DuskberryCrop");
		
		//TC
		cropIronOreBerryL.load(c.tConfig, "IronOreBerryCrop");
		cropGoldOreBerryL.load(c.tConfig, "GoldOreBerryCrop");
		cropCopperOreBerryL.load(c.tConfig, "CopperOreBerryCrop");
		cropTinOreBerryL.load(c.tConfig, "TinOreBerryCrop");
		cropAluminiumOreBerryL.load(c.tConfig, "AluminiumOreBerryCrop");
		cropEssenceOreBerryL.load(c.tConfig, "EssenceOreBerryCrop");

		//BoP
		BoPBerryL.load(c.tConfig, "BoPBerry");

		//NameOfCropL.load(c.tConfig, "NameOfCrop");
		
		c.tConfig.save();
	}

	@EventHandler
	public void load(FMLPreInitializationEvent load) {
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent postinit) {
		
		//CheckforMods
		IC2Installed = Loader.isModLoaded("IC2");
		NaturaInstalled = Loader.isModLoaded("Natura");
		TConstructInstalled = Loader.isModLoaded("TConstruct");
		BoPInstalled=Loader.isModLoaded("BiomesOPlenty");
		
		if (IC2Installed == false) 
		{
			System.out.println("IC2 NOT INSTALLED! WTF? YOU NEED IT FOR CROPS! POWAOFCAPLSLOCK!");
			
		}
		else 
		{
			System.out.println("IC2 found! Berries++ will now load!");
		}
		
		//Natura integration
		if (NaturaInstalled == true) {
		System.out.println("Natura found! Berries++ will use their items!");
		//OW Berrys Natura
		cropMaloberryL.registerBaseSeed(new ItemStack(NContent.berryItem, 1, 3));
		cropBlackberryL.registerBaseSeed(new ItemStack(NContent.berryItem, 1, 2));
		cropBlueberryL.registerBaseSeed(new ItemStack(NContent.berryItem, 1, 1));
		cropRaspberryL.registerBaseSeed(new ItemStack(NContent.berryItem, 1, 0));
		
		cropRaspberryL.register();
		cropMaloberryL.register();
		cropBlueberryL.register();
		cropBlackberryL.register();
		
		//Nether Berrys Natura
		cropBlightberryL.registerBaseSeed(new ItemStack(NContent.netherBerryItem, 1, 0));
		cropDuskberryL.registerBaseSeed(new ItemStack(NContent.netherBerryItem, 1 ,1));
		cropSkyberryL.registerBaseSeed(new ItemStack(NContent.netherBerryItem, 1, 2));
		cropStingberryL.registerBaseSeed(new ItemStack(NContent.netherBerryItem, 1, 3));
		cropBlightberryL.register();
		cropDuskberryL.register();
		cropSkyberryL.register();
		cropStingberryL.register();
		}
		
		//TC integration
		if (TConstructInstalled == true) 
		{
		System.out.println("Tinker's Construct found! Berries++ will use their items!");
		cropIronOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 0));
		cropGoldOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 1));
		cropCopperOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 2));
		cropTinOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 3));
		cropAluminiumOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 4));
		cropEssenceOreBerryL.registerBaseSeed(new ItemStack(TinkerWorld.oreBerries, 1, 5));
		cropIronOreBerryL.register();
		cropGoldOreBerryL.register();
		cropCopperOreBerryL.register();
		cropTinOreBerryL.register();
		cropAluminiumOreBerryL.register();
		cropEssenceOreBerryL.register();
		}

		
		//BoP integration
		if(BoPInstalled==true)
		{
			System.out.println("Biomes O' Plenty! found! Berries++ will use their items!");
			BoPBerryL.registerBaseSeed(new ItemStack(biomesoplenty.common.init.ModItems.berries,1,0));
			BoPBerryL.register();
		}

		// NameOfCropL.registerBaseSeed(new ItemStack(PlaceOfItem, AmmountOfItem, DMG));
		// NameOfCropL.register();
	}

	/*
	 * TODO:
	 * 1. TC Integration
	 * 2. Make Natura/TC Berries as item when Natura/TC is not Present
	 * 3. Oredict
	 */
}
