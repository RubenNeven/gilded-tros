package com.gildedtros.mappers;

import com.gildedtros.Item;
import com.gildedtros.enums.ItemTypeEnum;

import static com.gildedtros.enums.ItemTypeEnum.*;

public class ItemNameMapper {

    public static ItemTypeEnum map(Item item){
        if (item.name.toUpperCase().contains("WINE")) return WINE_ITEM;
        if (item.name.toUpperCase().contains("B-DAWG KEYCHAIN")) return LEGENDARY_ITEM;
        if (item.name.toUpperCase().contains("BACKSTAGE")) return BACKSTAGE_ITEM;
        if (item.name.toUpperCase().contains("DUPLICATE CODE")) return SMELLY_ITEM;
        if (item.name.toUpperCase().contains("LONG METHODS")) return SMELLY_ITEM;
        if (item.name.toUpperCase().contains("UGLY VARIABLE NAMES")) return SMELLY_ITEM;
        return NORMAL_ITEM;
    }

}
