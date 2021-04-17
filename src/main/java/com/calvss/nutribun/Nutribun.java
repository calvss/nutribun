package com.calvss.nutribun;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("nutribun")
public class Nutribun {
    public Nutribun() {
        // Get an instance of the mod event bus
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        registerCommonEvents(modEventBus);
    }

    /**
     * Register common events for both dedicated servers and clients. This method is safe to call directly.
     */
    public void registerCommonEvents(IEventBus eventBus) {
        eventBus.register(com.calvss.nutribun.nutribun_item.StartupCommon.class);
    }
}
