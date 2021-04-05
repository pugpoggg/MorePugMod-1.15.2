package com.pugs.morepugs.util;

import com.pugs.morepugs.MorePugsMod;
import com.pugs.morepugs.client.render.FlyingPugRenderer;
import com.pugs.morepugs.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid= MorePugsMod.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
public class EntitySetup {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        MorePugsMod.LOGGER.debug("FMLClientSetupEvent");
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.PUG.get(), FlyingPugRenderer::new);
    }
}
