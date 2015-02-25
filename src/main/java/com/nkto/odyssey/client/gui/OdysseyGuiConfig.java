package com.nkto.odyssey.client.gui;

import com.nkto.odyssey.configuration.ConfigurationHandler;
import com.nkto.odyssey.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class OdysseyGuiConfig extends GuiConfig
{
    public OdysseyGuiConfig(GuiScreen guiScreen)
    {
        super(
                guiScreen,
                new ConfigElement(ConfigurationHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.config.toString())
        );
    }
}
