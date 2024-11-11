package com.gildedtros.items;

import com.gildedtros.model.Item;

public class BackstageItem extends ItemType {
    public BackstageItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {

        increaseQuality();
        decreaseSellIn();
        if (item.sellIn <= 10 && item.sellIn > 5) {
            increaseQuality();
        }
        if (item.sellIn <= 5) {
            increaseQuality();
            increaseQuality();
        }
        if (item.sellIn <= 0){
            item.quality = 0;

        }
    }
}
