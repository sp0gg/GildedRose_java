package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.ConcertItem;
import com.sp0gg.gildedrose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ConcertItemTest {

    @Test
    public void updateItemShouldIncreaseQuality(){
        Item item = new ConcertItem("Concert Item", 15, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(14, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void updateItemShouldIncreaseQualityBy2WhenConcertWithin10Days(){
        Item item = new ConcertItem("Concert Item", 10, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(9, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void updateItemShouldIncreaseQualityBy3WhenConcertWithin5Days(){
        Item item = new ConcertItem("Concert Item", 5, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(4, item.getSellIn());
        assertEquals(23, item.getQuality());
    }

    @Test
    public void updateItemShouldZeroQualityWhenConcertOver(){
        Item item = new ConcertItem("Concert Item", 0, 0);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(-1, item.getSellIn());
        assertEquals(0, item.getQuality());
    }

}
