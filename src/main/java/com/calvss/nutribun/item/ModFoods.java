package com.calvss.nutribun.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
    public static final FoodProperties NUTRIBUN_FOOD_PROPERTIES = new FoodProperties.Builder().nutrition(8).fast()
        .saturationMod(0.7F).build();
}