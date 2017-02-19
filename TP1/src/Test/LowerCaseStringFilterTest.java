package Test;

import Main.LowerCaseStringFilter;
import Main.StringFilter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 23/09/2016.
 */
public class LowerCaseStringFilterTest {
    @Test
    public void filter() throws Exception {
        StringFilter filter = new LowerCaseStringFilter();
        String s = "MARMOTTE";
        assertEquals("marmotte", filter.filter(s));
    }

}