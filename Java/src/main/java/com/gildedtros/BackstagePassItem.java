package com.gildedtros;

public class BackstagePassItem extends ItemType{
    public BackstagePassItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.sellIn <= 10) {
            increaseQuality();
            increaseQuality();
        }
        if (item.sellIn <= 5) {
            increaseQuality();
            increaseQuality();
            increaseQuality();
        }
        if (item.sellIn < 0){
            item.quality = 0;
        }
    }
}
