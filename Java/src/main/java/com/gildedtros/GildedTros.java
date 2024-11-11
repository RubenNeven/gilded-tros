package com.gildedtros;

import java.util.Arrays;

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
            switch (Item.name) {
                case "Good Wine": new GoodWineItem(item).updateQuality();
            }
        }

       /* for (int i = 0; i < items.length; i++) {
            if (!Item.name.equals("Good Wine") && !Item.name.equals("Backstage passes for Re:Factor") && !Item.name.equals("Backstage passes for HAXX")) {
                if (Item.quality > 0) {
                    if (!Item.name.equals("B-DAWG Keychain")) {
                        Item.quality = Item.quality - 1;
                    }
                }
            } else {
                if (Item.quality < 50) {
                    Item.quality = Item.quality + 1;

                    if (items[i].name.equals("Backstage passes for Re:Factor") || items[i].name.equals("Backstage passes for HAXX")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("B-DAWG Keychain")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Good Wine")) {
                    if (!items[i].name.equals("Backstage passes for Re:Factor") && !items[i].name.equals("Backstage passes for HAXX")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("B-DAWG Keychain")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }*/
    }
}