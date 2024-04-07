
package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void regularItemQualityMoreThanZero() {
        Item[] items = new Item[] { new Item("Poo", 9, 6) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Poo", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void agedBrieQualityLessThanFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 33) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(34, app.items[0].quality);
    }

    @Test
    void backstageQualityLessThanFifty() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 40) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(43, app.items[0].quality);
    }

    @Test
    void Sulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 4, 40) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
    }

    @Test
    void regularItemSellInValNegative() {
        Item[] items = new Item[] { new Item("Poo", -9, 6) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Poo", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void agedBrieSellInValNegative() {
        Item[] items = new Item[] { new Item("Aged Brie", -10, 33) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(35, app.items[0].quality);
    }

    @Test
    void backstageSellInValNegative() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -4, 40) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-5, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void conjuredQualityDecreaseTwiceAsNormalItem() {
        Item[] items = new Item[] { new Item("Conjured", 10, 33) };
        GildedRose app = new GildedRose(items);
        app.itemUpdate();
        assertEquals("Conjured", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }

}
