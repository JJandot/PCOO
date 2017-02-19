import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class OddTest {
    @Test
    public void test() throws Exception {
        Predicate p = new Odd();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(p.test(list.get(0)), equalTo(true));
        assertThat(p.test(list.get(1)), equalTo(false));
        assertThat(p.test(list.get(2)), equalTo(true));
    }

}