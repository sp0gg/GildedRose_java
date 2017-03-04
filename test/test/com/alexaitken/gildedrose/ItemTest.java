package test.com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.NewItem;
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
        NewItem item = mock(NewItem.class, CALLS_REAL_METHODS);

        item.setQuality(60);

        Assert.assertEquals(50, item.getQuality());
    }

    @Test
    public void assignQualityMin0(){
        NewItem item = mock(NewItem.class, CALLS_REAL_METHODS);

        item.setQuality(-44);

        Assert.assertEquals(0, item.getQuality());
    }
}
