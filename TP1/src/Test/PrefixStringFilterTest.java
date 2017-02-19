package Test;

import Main.PrefixStringFilter;
import Main.StringFilter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 23/09/2016.
 */
public class PrefixStringFilterTest {
    @Test
    public void filter() throws Exception {
        StringFilter filter = new PrefixStringFilter(5);
        String s = "marmotte";
        assertEquals("marmo", filter.filter(s));
    }

}