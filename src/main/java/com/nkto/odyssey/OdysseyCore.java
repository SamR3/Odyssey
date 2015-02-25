package com.nkto.odyssey;

import com.nkto.odyssey.configuration.ConfigurationHandler;
import com.nkto.odyssey.proxy.IProxy;
import com.nkto.odyssey.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class OdysseyCore
{
    @Mod.Instance(Reference.MOD_ID)
    public static OdysseyCore instance;

    @SidedProxy(clientSide = "com.nkto.odyssey.proxy.ClientProxy", serverSide = "com.nkto.odyssey.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
