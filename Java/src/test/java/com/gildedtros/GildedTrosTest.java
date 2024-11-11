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
                new Item("Backstage passes", 20, 10),
                new Item("Backstage passes", 10, 10),
                new Item("Backstage passes", 5, 10),
                new Item("Backstage passes", 5, 10),
                new Item("B-DAWG KEYCHAIN", 10, 50),
                new Item("Ugly Variable Names", 10, 10),
        };
        GildedTros app = new GildedTros(items);
        app.updateQuality();
        Arrays.stream(app.getItems()).forEach(System.out::println);

    }

}
