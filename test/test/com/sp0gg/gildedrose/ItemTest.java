package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.Item;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ItemTest {

    @Test
    public void setQualityMax50(){
        Item item = new Item("Item",1, 1);
        item.setDegradationRate(-100);

        item.updateQuality();

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void setQualityMin0(){
        Item item = new Item("Item",1, 1);
        item.setDegradationRate(100);

        item.updateQuality();

        Assert.assertEquals(0, item.getQuality());
    }

    @Test
    public void updateQualityIncreasesQualityByDegradationRate(){
        Item item = new Item("Item",3, 3);

        item.setDegradationRate(2);
        item.setAgeRate(2);

        item.updateQuality();

        Assert.assertEquals(1, item.getQuality());
        Assert.assertEquals(1, item.getSellIn());
    }

    @Test
    public void updateItemShouldUpdatePropertiesForNonExpiredItem(){
        Item item = new Item("Standard Item", 10, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(9, item.getSellIn());
        assertEquals(19, item.getQuality());
    }

    @Test
    public void updateItemShouldUpdatePropertiesForExpiredItem(){
        Item item = new Item("Standard Item", 0, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(-1, item.getSellIn());
        assertEquals(18, item.getQuality());
    }
}
