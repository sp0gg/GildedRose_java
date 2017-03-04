package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.Item;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ItemTest {

    @Test
    public void setQualityMax50(){
        Item item = mock(Item.class, CALLS_REAL_METHODS);

        item.setQuality(60);

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void setQualityMin0(){
        Item item = mock(Item.class, CALLS_REAL_METHODS);

        item.setQuality(-44);

        Assert.assertEquals(0, item.getQuality());
    }

    @Test
    public void updateQualityIncreasesQualityByDegradationRate(){
        Item item = mock(Item.class, CALLS_REAL_METHODS);
        item.setDegradationRate(1);

        item.updateQuality();

        Assert.assertEquals(0, item.getQuality());
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
