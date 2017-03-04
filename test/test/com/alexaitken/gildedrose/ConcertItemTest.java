package test.com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.ConcertItem;
import com.alexaitken.gildedrose.NewItem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ConcertItemTest {

    @Test
    public void updateItemShouldIncreaseQuality(){
        NewItem item = new ConcertItem("Concert Item", 15, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(14, item.getSellIn());
        assertEquals(21, item.getQuality());
    }

    @Test
    public void updateItemShouldIncreaseQualityWhenConcertClose(){
        NewItem item = new ConcertItem("Concert Item", 10, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(9, item.getSellIn());
        assertEquals(22, item.getQuality());
    }

    @Test
    public void updateItemShouldIncreaseQualityWhenConcertImminent(){
        NewItem item = new ConcertItem("Concert Item", 5, 20);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(4, item.getSellIn());
        assertEquals(25, item.getQuality());
    }

    @Test
    public void updateItemShouldZeroQualityWhenConcertOver(){
        NewItem item = new ConcertItem("Concert Item", 0, 0);

        item.updateQuality();

        assertEquals("Concert Item", item.getName());
        assertEquals(-1, item.getSellIn());
        assertEquals(0, item.getQuality());
    }

}
