package com.gildedtros;

public class GoodWineItem extends ItemType{
    public GoodWineItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        increaseQuality();
        decreaseSellIn();
    }
}
