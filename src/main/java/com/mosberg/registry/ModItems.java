package com.mosberg.registry;

import com.mosberg.item.CustomFishItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mosberg.BeyondTheBobber.MOD_ID;

public class ModItems {
    public static final Item CUSTOM_FISH = new CustomFishItem();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "custom_fish"), CUSTOM_FISH);
    }
}
