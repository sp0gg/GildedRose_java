package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.Item;
import com.sp0gg.gildedrose.StandardItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class StandardItemTest {

    @Test
    public void updateItemShouldUpdatePropertiesForNonExpiredItem(){
        Item item = new StandardItem("Standard Item", 10, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(9, item.getSellIn());
        assertEquals(19, item.getQuality());
    }

    @Test
    public void updateItemShouldUpdatePropertiesForExpiredItem(){
        Item item = new StandardItem("Standard Item", 0, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(-1, item.getSellIn());
        assertEquals(18, item.getQuality());
    }
}
