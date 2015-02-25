package com.nkto.odyssey.init;

import com.nkto.odyssey.block.BlockConsole;
import com.nkto.odyssey.block.BlockOdyssey;
import com.nkto.odyssey.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class ModBlocks
{
    public static BlockOdyssey console;

    public static void preInit()
    {
        console = new BlockConsole();
        //GameRegistry.registerBlock(console, "console");
    }

    public static void init(FMLInitializationEvent event)
    {
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            renderItem.getItemModelMesher().register(Item.getItemFromBlock(console), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((BlockOdyssey) console).getUnlocalizedName(), "inventory"));
        }
    }
}
