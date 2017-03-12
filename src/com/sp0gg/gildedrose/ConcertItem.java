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
        this.setDegradationRate(calculateDegradationRate());
        super.updateQuality();
    }

    private int calculateDegradationRate() {
        int sellIn = this.getSellIn();
        if(sellIn < 1) {
            return this.getQuality();
        }else if (sellIn <= 5) {
            return -3;
        }else if (sellIn <= 10) {
            return -2;
        }else{
            return -1;
        }
    }
}
