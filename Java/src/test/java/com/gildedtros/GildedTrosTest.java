package com.gildedtros;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        Item[] items = new Item[] {
                new Item("Good Wine", 6, 40),
                new Item("Normal Item 1", 5, 30),
                new Item("Normal Item 2", -1, 40),
        };
        GildedTros app = new GildedTros(items);
        app.updateQuality();
        Arrays.stream(app.getItems()).forEach(System.out::println);

    }

}
