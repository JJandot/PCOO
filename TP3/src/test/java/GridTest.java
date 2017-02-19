import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class GridTest {


    @Test
    public void get() throws Exception {
        Integer[][] grille = new Integer[3][2];
        for (int i = 0; i < grille.length; ++i){
            for (int j = 0; j < grille[0].length; ++j)
                System.out.print(grille[i][j] = i);
            System.out.println("");
        }
        Grid<Integer> grid = new Grid<>(grille);
        assertThat(grid.get(1, 1), equalTo(1));
    }

    @Test
    public void nbLine() throws Exception {
        Grid<Integer> grid = new Grid<>(new Integer[3][2]);
        assertThat(grid.nbLine(), equalTo(3));
    }

    @Test
    public void nbColumn() throws Exception {
        Grid<Integer> grid = new Grid<>(new Integer[3][2]);
        assertThat(grid.nbColumn(), equalTo(2));
    }

}