package com.nkto.odyssey.configuration;

import com.nkto.odyssey.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration config;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        // Create config object from given file
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            // Resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is a test config value.");

        if (config.hasChanged())
        {
            config.save();
        }
    }
}
