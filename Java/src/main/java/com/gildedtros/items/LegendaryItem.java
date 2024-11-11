package com.gildedtros.items;

import com.gildedtros.Item;

public class LegendaryItem extends ItemType {

    public LegendaryItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        // NEVER SOLD & NEVER DECREASES IN QUALITY
    }
}
