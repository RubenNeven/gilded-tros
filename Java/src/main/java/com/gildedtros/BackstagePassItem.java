package com.gildedtros;

public class BackstagePassItem extends ItemType{
    public BackstagePassItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (Item.sellIn <= 10) {
            increaseQuality();
            increaseQuality();
        }
        if (Item.sellIn <= 5) {
            increaseQuality();
            increaseQuality();
            increaseQuality();
        }
        if (Item.sellIn < 0){
            Item.quality = 0;
        }
    }
}
