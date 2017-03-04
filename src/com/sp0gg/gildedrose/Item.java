package com.sp0gg.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class Item {
    private String name;
    private int quality;
    protected int sellIn;
    protected int degradationRate = 1;
    protected int ageRate = 1;

    public Item(String name, int sellIn, int quality) {
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

    public void updateQuality() {
        this.sellIn -= ageRate;
        int rate = this.degradationRate;

        if (this.sellIn < 0) {
            rate *= 2;
        }

        setQuality(this.quality - rate);
    }

    public void setQuality(int quality) {
        if(quality > 50) {
            this.quality = 50;
        }else if (quality < 0) {
            this.quality = 0;
        }else{
            this.quality = quality;
        }
    }

    public void setDegradationRate(int degradationRate) {
        this.degradationRate = degradationRate;
    }

}
