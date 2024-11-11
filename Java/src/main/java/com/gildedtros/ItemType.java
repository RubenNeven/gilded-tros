package com.gildedtros;

public abstract class ItemType {

    public final Item item;

    public ItemType(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();

    public void decreaseSellIn() {
        --item.sellIn;
    }

    public void decreaseQuality() {
        if (item.quality > 0 ) --item.quality;
    }

    public void increaseQuality() {
        if (item.quality < 50 ) ++item.quality;
    }
}
