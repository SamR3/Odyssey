package com.nkto.odyssey.block;

import com.nkto.odyssey.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockConsole extends BlockOdyssey
{
    public static final String name = "console";

    public BlockConsole()
    {
        super();
        this.setUnlocalizedName(name);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(Reference.MOD_ID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
