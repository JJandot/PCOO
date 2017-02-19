package Test;

import Main.StringFilter;
import Main.UpperCaseStringFilter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 23/09/2016.
 */
public class UpperCaseStringFilterTest {
    @Test
    public void filter() throws Exception {
        StringFilter filter = new UpperCaseStringFilter();
        String s = "marmotte";
        assertEquals("MARMOTTE", filter.filter(s));
    }

}