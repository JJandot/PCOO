import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Julien on 11/10/2016.
 */
public class FilterTest {
    @Test
    public void filter() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(5);
        List result = Filter.filter(new And(new Odd(), new Leq(6)), list);
        assertThat((int)result.get(0), equalTo(1));
        assertThat((int)result.get(1), equalTo(5));
    }

}