package com.gildedtros.items;

import com.gildedtros.Item;

public class SmellyItem extends ItemType {

    public SmellyItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseQuality();
        decreaseSellIn();
    }
}
