package com.gildedrose;

public class BackStage extends BaseItem{

    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

    BackStage(Item item){
        super(item);
    }


    @Override
    protected void updateQualityByName() {
        increaseQualityIfLessThanMax();
        if (item.sellIn < 11) {
            increaseQualityIfLessThanMax();
        }
        if (item.sellIn < 6) {
            increaseQualityIfLessThanMax();
        }
    }
    @Override
    protected void updateQualityWhenSellInValNegative() {
        item.quality = 0;
    }

}
