package com.gildedtros;

import com.gildedtros.factories.ItemFactory;

class GildedTros {

    private final Item[] items;

    public Item[] getItems(){
        return items;
    }

    public GildedTros(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
           ItemFactory.createItemType(item).updateQuality();
        }
    }
}