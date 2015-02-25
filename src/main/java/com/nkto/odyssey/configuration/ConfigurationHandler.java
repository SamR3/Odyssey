package com.nkto.odyssey.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create config object from given file
        Configuration config = new Configuration(configFile);

        try
        {
            // Load config file
            config.load();

            // Read in properties from config file

        }
        catch (Exception c)
        {
            // Catch the exception
        }
        finally
        {
            config.save();

            // Save the config file
        }
    }
}
