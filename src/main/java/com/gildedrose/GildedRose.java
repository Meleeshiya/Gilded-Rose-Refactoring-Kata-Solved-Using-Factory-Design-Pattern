package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void itemUpdate() {
        for (Item item : items) {
            BaseItem baseItem = new BaseItem(item);
            baseItem.create(item).updateItem();
        }
    }


}
