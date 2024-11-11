package com.gildedtros;

public abstract class ItemType {

    private final Item item;

    public ItemType(Item item) {
        this.item = item;
    }

    public abstract void updateQuality();

    public void decreaseSellIn() {
        --Item.sellIn;
    }

    public void decreaseQuality() {
        if (Item.quality > 0 ) --Item.quality;
    }

    public void increaseQuality() {
        if (Item.quality < 50 ) ++Item.quality;
    }
}
