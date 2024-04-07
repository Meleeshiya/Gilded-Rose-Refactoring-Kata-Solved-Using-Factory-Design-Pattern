package com.gildedrose;

public class Conjured extends BaseItem {

    public static final String CONJURED = "Conjured";

    Conjured(Item item){
        super(item);
    }

    @Override
    protected void updateQualityByName() {
        if (item.quality > 0) {
            item.quality -= 2;
        }
    }
}
