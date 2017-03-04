package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.ConjuredItem;
import com.sp0gg.gildedrose.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ConjuredItemTest {

    @Test
    public void updateQualityDegradesQualityAtDoubleRate(){
        Item item = new ConjuredItem("Conjured item", 10, 20);

        item.updateQuality();

        Assert.assertEquals("Conjured item", item.getName());
        Assert.assertEquals(18, item.getQuality());
        Assert.assertEquals(9, item.getSellIn());
    }
}
