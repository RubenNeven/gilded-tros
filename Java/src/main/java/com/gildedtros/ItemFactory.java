package com.gildedtros;

import com.gildedtros.enums.ItemTypeEnum;
import com.gildedtros.items.*;
import com.gildedtros.mappers.ItemNameMapper;

public class ItemFactory {

    public static ItemType createItemType(Item item) {
        ItemTypeEnum itemType = ItemNameMapper.map(item);
        switch (itemType) {
            case WINE_ITEM:
                return new GoodWineItem(item);
            case BACKSTAGE_ITEM:
                return new BackstageItem(item);
            case SMELLY_ITEM:
                return new SmellyItem(item);
            case LEGENDARY_ITEM:
                return new LegendaryItem(item);
            default:
                return new NormalItem(item);
        }
    }
}
