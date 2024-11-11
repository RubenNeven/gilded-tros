package com.gildedtros.items;

import com.gildedtros.Item;

public class GoodWineItem extends ItemType {
    public GoodWineItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        decreaseSellIn();
    }
}
