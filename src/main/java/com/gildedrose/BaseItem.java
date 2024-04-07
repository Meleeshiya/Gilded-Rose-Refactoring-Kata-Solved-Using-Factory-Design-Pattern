package com.gildedrose;

public class BaseItem {

    public Item item;

    public BaseItem create(Item item){
        if(item.name.equals(AgedBrie.AGED_BRIE)) {
            return new AgedBrie(item);
        } else if  (item.name.equals(BackStage.BACKSTAGE)){
            return new BackStage(item);
        } else if(item.name.equals(Sulfurus.SULFURAS)){
            return new Sulfurus(item);
        } else if(item.name.equals(Conjured.CONJURED)){
            return new Conjured(item);
        }
        return new BaseItem(item);
    }

    BaseItem(Item item) { this.item = item; }

    public void updateItem() {
        updateQualityByName();
        updateSellInVal();
        if (item.sellIn < 0) {
            updateQualityWhenSellInValNegative();
        }
    }

    protected void updateQualityByName() {
        decreaseQualityIfHigerThanMin();
    }

    protected void decreaseQualityIfHigerThanMin() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void increaseQualityIfLessThanMax() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void updateQualityWhenSellInValNegative() {
        decreaseQualityIfHigerThanMin();
    }

    protected void updateSellInVal() {
        item.sellIn = item.sellIn - 1;
    }


}
