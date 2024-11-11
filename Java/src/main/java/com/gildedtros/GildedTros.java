package com.gildedtros;

import com.gildedtros.items.BackstageItem;
import com.gildedtros.items.GoodWineItem;
import com.gildedtros.items.NormalItem;
import com.gildedtros.items.SmellyItem;
import com.gildedtros.mappers.ItemNameMapper;
import com.gildedtros.enums.ItemTypeEnum;

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
            ItemTypeEnum itemType = ItemNameMapper.map(item);
            switch (itemType) {
                case WINE_ITEM:
                    new GoodWineItem(item).updateQuality();
                    break;
                case BACKSTAGE_ITEM:
                    new BackstageItem(item).updateQuality();
                    break;
                case SMELLY_ITEM:
                    new SmellyItem(item).updateQuality();
                    break;
                case LEGENDARY_ITEM:
                    break;
                default:
                    new NormalItem(item).updateQuality();
                    break;
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