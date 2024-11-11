package com.gildedtros;

import com.gildedtros.model.Item;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedTrosTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedTros app = new GildedTros(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].name);
    }

    @Test
    void goodWineItem() {
        Item[] items = new Item[] {
                new Item("Good Wine", 6, 40),
                new Item("Good Wine", 0, 20),
                new Item("Normal Item 1", 5, 30),
                new Item("Normal Item 2", -1, 40),
                new Item("Backstage passes", 20, 10),
                new Item("Backstage passes", 10, 10),
                new Item("Backstage passes", 0, 10),

                new Item("B-DAWG KEYCHAIN", 10, 50),
                new Item("Ugly Variable Names", 10, 10),
        };
        GildedTros app = new GildedTros(items);
        app.updateQuality();

        assertEquals(5, app.getItems()[0].sellIn);
        assertEquals(39, app.getItems()[0].quality);

        assertEquals(-1, app.getItems()[1].sellIn);
        assertEquals(21, app.getItems()[1].quality);

        assertEquals(4, app.getItems()[2].sellIn);
        assertEquals(29, app.getItems()[2].quality);

        assertEquals(-2, app.getItems()[3].sellIn);
        assertEquals(38, app.getItems()[3].quality);

        assertEquals(19, app.getItems()[4].sellIn);
        assertEquals(11, app.getItems()[4].quality);

        assertEquals(9, app.getItems()[5].sellIn);
        assertEquals(12, app.getItems()[5].quality);

        assertEquals(-1, app.getItems()[6].sellIn);
        assertEquals(0, app.getItems()[6].quality);

        assertEquals(10, app.getItems()[7].sellIn);
        assertEquals(50, app.getItems()[7].quality);

        assertEquals(9, app.getItems()[8].sellIn);
        assertEquals(8, app.getItems()[8].quality);
    }

}
