import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class RangeArrayTest {
    @Test
    public void set() throws Exception {
        RangeArray<Integer> array = new RangeArray<>(-3, 1);
        array.set(1, 5);
        assertThat(array.get(1), equalTo(5));
    }

    @Test
    public void userIndexIsValid() throws Exception {
        RangeArray<Integer> array = new RangeArray<>(-3, 1);
        assertThat(array.userIndexIsValid(0), equalTo(true));
        assertThat(array.userIndexIsValid(9), equalTo(false));
    }

    @Test
    public void internalIndex() throws Exception {
        RangeArray<Integer> array = new RangeArray<>(-3, 1);
        assertThat(array.internalIndex(-3), equalTo(0));
    }

    @Test
    public void get() throws Exception {
        RangeArray<Integer> array = new RangeArray<>(-3, 1);
        array.set(1, 5);
        assertThat(array.get(1), equalTo(5));
    }

    @Test
    public void rangeSize() throws Exception {
        RangeArray<Integer> array = new RangeArray<>(0, 5);
        assertThat(array.rangeSize(), equalTo(6));
    }
}