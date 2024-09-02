package net.enzo.str;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.enzo.str.config.Config;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = STRMod.MODID, version = STRMod.VERSION)
public class STRMod
{
    public static final String MODID = "str";
    public static final String VERSION = "1.0";

    @EventHandler
    public void pre(FMLPreInitializationEvent event) {
        Config.letsConfigurate(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new STREventHandler());
    }
}
