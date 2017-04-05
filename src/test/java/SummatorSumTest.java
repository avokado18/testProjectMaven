import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummatorSumTest {
    @Test
    public void sumTest(){
        Summator summator = new Summator();

        int res = summator.sum(1,3);

        assertEquals(4, res);
    }
}
