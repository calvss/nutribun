package com.calvss.nutribun.nutribun_item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class StartupCommon {
    public static Nutribun_Item nutribun;  // this holds the unique instance of your block

    @SubscribeEvent
    public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
        nutribun = new Nutribun_Item();
        nutribun.setRegistryName("nutribun_item");
        itemRegisterEvent.getRegistry().register(nutribun);
    }
}
