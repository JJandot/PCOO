import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class RangeArrayIteratorTest {
    @Test
    public void hasNext() throws Exception {
        RangeArrayIterator<Integer> rangeArray = new RangeArrayIterator<>(new RangeArray<Integer>(-3, 1));
        assertThat(rangeArray.hasNext(), equalTo(true));
    }

    @Test
    public void next() throws Exception {
        RangeArrayIterator<Integer> rangeArray = new RangeArrayIterator<>(new RangeArray<Integer>(-3, 1));
        assertThat(rangeArray.next(), equalTo(null));
    }

}