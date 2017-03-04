package test.com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.LegendaryItem;
import com.alexaitken.gildedrose.NewItem;
import com.alexaitken.gildedrose.StandardItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class LegendaryItemTest {


    @Test
    public void updateItemShouldNeverChangeProperties(){
        NewItem item = new LegendaryItem("Legendary Item");

        item.updateQuality();

        assertEquals("Legendary Item", item.getName());
        assertEquals(0, item.getSellIn());
        assertEquals(80, item.getQuality());
    }

}
