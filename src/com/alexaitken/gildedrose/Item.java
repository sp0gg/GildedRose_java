package com.alexaitken.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public abstract class Item {
    private String name;
    int sellIn;
    private int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public abstract void updateQuality();

    public void setQuality(int quality) {
        if(quality > 50) {
            this.quality = 50;
        }else if (quality < 0) {
            this.quality = 0;
        }else{
            this.quality = quality;
        }
    }
}
