package com.alexaitken.gildedrose;

/**
 * Created by sp0gg on 3/4/17.
 */
public class VintageItem extends NewItem {

    public VintageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn -= 1;
        this.setQuality(this.getQuality() + 1);
    }
}
