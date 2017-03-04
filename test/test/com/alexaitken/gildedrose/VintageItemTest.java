package test.com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.VintageItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class VintageItemTest {

    @Test
    public void updateItemIncreasesQuality(){
        Item item = new VintageItem("Vintage Item", 20, 10);

        item.updateQuality();

        assertEquals("Vintage Item", item.getName());
        assertEquals(19, item.getSellIn());
        assertEquals(11, item.getQuality());
    }
}
