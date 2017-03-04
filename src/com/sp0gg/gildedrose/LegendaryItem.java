package com.sp0gg.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class LegendaryItem extends Item {
    public LegendaryItem(String name) {
        super(name, 0, 80);
        this.degradationRate = 0;
        this.ageRate = 0;
    }

    @Override
    public void updateQuality(){

    }
}
