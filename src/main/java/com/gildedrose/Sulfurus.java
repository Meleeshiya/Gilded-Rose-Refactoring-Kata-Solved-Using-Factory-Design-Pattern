package com.gildedrose;

public class Sulfurus extends BaseItem{

    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Sulfurus(Item item){
        super(item);
    }

    @Override
    protected void updateQualityByName() {
        return;
    }

    @Override
    protected void updateSellInVal() {
        return;
    }
    @Override
    protected void updateQualityWhenSellInValNegative() {
        return;
    }
}
