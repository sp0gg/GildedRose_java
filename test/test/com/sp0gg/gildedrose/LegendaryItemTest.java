package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.LegendaryItem;
import com.sp0gg.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class LegendaryItemTest {


    @Test
    public void updateItemShouldNeverChangeProperties(){
        Item item = new LegendaryItem("Legendary Item");

        item.updateQuality();

        assertEquals("Legendary Item", item.getName());
        assertEquals(0, item.getSellIn());
        assertEquals(80, item.getQuality());
    }

}
