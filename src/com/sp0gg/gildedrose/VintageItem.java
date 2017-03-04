package com.sp0gg.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class VintageItem extends Item {

    public VintageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.setDegradationRate(-1);
    }

}
