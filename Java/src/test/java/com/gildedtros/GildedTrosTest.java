package com.gildedtros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedTrosTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedTros app = new GildedTros(items);
        app.updateQuality();
        //assertEquals("fixme", app.getItems()[0].name);
    }

    @Test
    void goodWineItem() {
        Item[] items = new Item[] { new Item("Good Wine", 5, 40) };
        GildedTros app = new GildedTros(items);
        app.updateQuality();
        Item item = app.getItems()[0];
        System.out.println(item);
    }

}
