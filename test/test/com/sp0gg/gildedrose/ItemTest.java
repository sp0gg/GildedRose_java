package test.com.sp0gg.gildedrose;

import com.sp0gg.gildedrose.Item;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;

/**
 * Created by sp0gg on 3/4/17.
 */
public class ItemTest {

    @Test
    public void assignQualityMax50(){
        Item item = mock(Item.class, CALLS_REAL_METHODS);

        item.setQuality(60);

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void assignQualityMin0(){
        Item item = mock(Item.class, CALLS_REAL_METHODS);

        item.setQuality(-44);

        Assert.assertEquals(0, item.getQuality());
    }
}
