package com.calvss.nutribun.nutribun_item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;

public class Nutribun_Item extends Item {
    public Nutribun_Item()
    {
        super(new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_MISC).food(nutribunFood) // the item will appear on the Miscellaneous tab in creative
        );
    }
    private static final Food nutribunFood = (new Food.Builder()).nutrition(5).saturationMod(0.6F).build();
}
