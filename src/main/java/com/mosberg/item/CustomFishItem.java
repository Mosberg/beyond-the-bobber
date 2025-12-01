package com.mosberg.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CustomFishItem extends Item {
    public CustomFishItem() {
        super(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    }
}
