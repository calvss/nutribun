package com.calvss.nutribun;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("nutribun")
public class Nutribun {
    public Nutribun() {
        // Get an instance of the mod event bus
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::enqueue);

        registerCommonEvents(modEventBus);
    }

    private void enqueue(final InterModEnqueueEvent evt) {
        if (ModList.get().isLoaded("diet")) {
            //TODO: Diet integration
        }
    }

    /**
     * Register common events for both dedicated servers and clients. This method is safe to call directly.
     */
    public void registerCommonEvents(IEventBus eventBus) {
        eventBus.register(com.calvss.nutribun.nutribun_item.StartupCommon.class);
    }
}
