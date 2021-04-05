package com.pugs.morepugs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pugs.morepugs.init.EntityInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("pugzmod")
public class MorePugsMod
{
    // Let's you print to the console with FirstMod.LOGGER.debug(String)
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "pugzmod";
    

    public MorePugsMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        
        EntityInit.ENTITY_TYPES.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}
    
}
