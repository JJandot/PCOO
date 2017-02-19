import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class AndTest {
    @Test
    public void test() throws Exception {
        Predicate p = new And<>(new Odd(), new Leq<>(6));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(5);
        assertThat(p.test(list.get(0)), equalTo(true));
        assertThat(p.test(list.get(1)), equalTo(false));
        assertThat(p.test(list.get(2)), equalTo(false));
        assertThat(p.test(list.get(3)), equalTo(true));

    }

}