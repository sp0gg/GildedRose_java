package com.alexaitken.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ConcertItem extends Item {

    public ConcertItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn -= 1;
        calculateQuality();
    }

    private void calculateQuality() {
        if(this.sellIn < 0) {
            this.setQuality(0);
        }else if (this.sellIn <= 5) {
            this.setQuality(this.getQuality() + 3);
        }else if (this.sellIn < 10) {
            this.setQuality(this.getQuality() + 2);
        }else{
            this.setQuality(this.getQuality() + 1);
        }
    }
}
