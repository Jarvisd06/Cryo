package com.jarvis.cryo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "cryo", name = "cryo", version = "1.12.2-1.0")

public class cryo
{

    @Mod.Instance("cryo")   // this is where you can ref back to an instance of your mod
                            // safely knowing it hasn't been tampered with
    public static cryo instance;

    @Mod.EventHandler       // network handling -- config files -- items and block initialisation
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler       // reg guis tile entities crafting recipies and any other event handlers
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler       // good place to run any code you wanna run after every mod has initialised
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
