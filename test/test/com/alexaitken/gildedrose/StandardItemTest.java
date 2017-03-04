package test.com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.NewItem;
import com.alexaitken.gildedrose.StandardItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class StandardItemTest {

    @Test
    public void updateItemShouldUpdatePropertiesForNonExpiredItem(){
        NewItem item = new StandardItem("Standard Item", 10, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(9, item.getSellIn());
        assertEquals(19, item.getQuality());
    }

    @Test
    public void updateItemShouldUpdatePropertiesForExpiredItem(){
        NewItem item = new StandardItem("Standard Item", 0, 20);

        item.updateQuality();

        assertEquals("Standard Item", item.getName());
        assertEquals(-1, item.getSellIn());
        assertEquals(18, item.getQuality());
    }
}
