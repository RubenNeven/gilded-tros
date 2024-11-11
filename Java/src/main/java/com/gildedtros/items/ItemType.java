package com.gildedtros.items;

import com.gildedtros.model.Item;

public abstract class ItemType {

    public final Item item;

    public ItemType(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();

    protected void decreaseSellIn() {
        --item.sellIn;
    }

    protected void decreaseQuality() {
        if (item.quality > 0 ) --item.quality;
    }

    protected void increaseQuality() {
        if (item.quality < 50 ) ++item.quality;
    }
}
