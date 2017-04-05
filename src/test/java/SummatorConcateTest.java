import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 05.04.2017.
 */
public class SummatorConcateTest {
    @Test
    public void testConcate(){
        Summator summator = new Summator();

        String result = summator.concate("one", "two");

        assertEquals("onetwo", result);
    }
}
