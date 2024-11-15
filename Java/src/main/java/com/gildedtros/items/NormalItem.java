package com.gildedtros.items;

import com.gildedtros.model.Item;

public class NormalItem extends ItemType {

    public NormalItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseQuality();
        decreaseSellIn();
        if (item.sellIn < 0) {
            decreaseQuality();
        }
    }
}
