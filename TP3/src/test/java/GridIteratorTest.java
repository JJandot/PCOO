import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class GridIteratorTest {
    @Test
    public void hasNext() throws Exception {
        GridIterator<Integer> grid = new GridIterator<>(new Grid<>(new Integer[2][2]));
        assertThat(grid.hasNext(), equalTo(true));
    }

    @Test
    public void next() throws Exception {
        GridIterator<Integer> grid = new GridIterator<>(new Grid<>(new Integer[2][2]));
        assertThat(grid.next(), equalTo(null));
    }

}