package Test;

import Main.PostfixStringFilter;
import Main.StringFilter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 23/09/2016.
 */
public class PostfixStringFilterTest {
    @Test
    public void filter() throws Exception {
        StringFilter filter = new PostfixStringFilter(5);
        String s = "marmotte";
        assertEquals("tte", filter.filter(s));
    }

}