package Test;

import Main.AsciiStringFilter;
import Main.StringFilter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Julien on 23/09/2016.
 */
public class AsciiStringFilterTest {
    @Test
    public void filter() throws Exception {
        StringFilter filter = new AsciiStringFilter();
        String s = "Mézon";
        assertEquals("Mzon", filter.filter(s));
    }

}