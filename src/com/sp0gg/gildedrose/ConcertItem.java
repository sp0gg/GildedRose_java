package com.sp0gg.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ConcertItem extends Item {

    public ConcertItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.degradationRate = calculateDegradationRate();
        super.updateQuality();
    }

    private int calculateDegradationRate() {
        if(this.sellIn < 1) {
            return this.getQuality();
        }else if (this.sellIn <= 5) {
            return -3;
        }else if (this.sellIn <= 10) {
            return -2;
        }else{
            return -1;
        }
    }
}
