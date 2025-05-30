package com.calvss.nutribun.item;

import com.calvss.nutribun.Nutribun;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Nutribun.MOD_ID);

    public static final RegistryObject<Item> NUTRIBUN_ITEM = ITEMS.register("nutribun_item", () -> new Item(new Item.Properties().food(ModFoods.NUTRIBUN_FOOD_PROPERTIES)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
