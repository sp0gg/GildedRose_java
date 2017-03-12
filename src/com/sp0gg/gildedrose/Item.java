package com.sp0gg.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class Item {
    private String name;
    private int quality;
    private int sellIn;
    private int degradationRate = 1;
    private int ageRate = 1;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQuality() {
        setSellIn(this.getSellIn() - ageRate);

        if (this.getSellIn() < 0) {
            setDegradationRate(this.degradationRate * 2);
        }

        setQuality(this.quality - degradationRate);
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setDegradationRate(int degradationRate) {
        this.degradationRate = degradationRate;
    }

    public void setAgeRate(int ageRate) {
        this.ageRate = ageRate;
    }

    public int getQuality() {
        return quality;
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
}
