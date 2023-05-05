package com.okaiden.wideworldmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

public class ModFoods extends Foods {
    public static final FoodProperties ORANGE = (new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build());
    public static final FoodProperties PEAR = (new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build());
    public static final FoodProperties BANANA = (new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build());
    public static final FoodProperties KIWI = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).build());
    public static final FoodProperties GRAPE = (new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build());
    public static final FoodProperties BLUEBERRY = (new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build());
    public static final FoodProperties LEMON = (new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build());
    public static final FoodProperties CHERRY = (new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build());
}
