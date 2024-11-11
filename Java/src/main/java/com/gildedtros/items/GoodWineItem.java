package com.gildedtros.items;

import com.gildedtros.model.Item;

public class GoodWineItem extends ItemType {
    public GoodWineItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decreaseSellIn();

        if (item.sellIn < 0) {
            increaseQuality();
        } else {
            decreaseQuality();
        }



    }
}
