package com.sp0gg.gildedrose;

public class Inventory {

	private Item[] items;

	public Inventory(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			item.updateQuality();
		}
	}
}
