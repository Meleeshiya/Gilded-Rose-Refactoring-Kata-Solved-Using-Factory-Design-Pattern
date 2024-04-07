package com.gildedrose;

public class AgedBrie extends BaseItem{

    public static final String AGED_BRIE = "Aged Brie";

    AgedBrie(Item item) {
        super(item);
    }

    @Override
    protected void updateQualityByName(){
        increaseQualityIfLessThanMax();
    }

    @Override
    protected void updateQualityWhenSellInValNegative() {
        increaseQualityIfLessThanMax();
    }

}
