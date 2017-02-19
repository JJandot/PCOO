/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class SquareRootTest {
    @Test
    public void asString() throws Exception {
        Formula formula = new SquareRoot(new Variable("x", 5));
        assertThat(formula.asString(), equalTo('\u221a' + "x"));
    }

    @Test
    public void asValue() throws Exception {
        Formula formula = new SquareRoot(new Variable("x", 25));
        assertThat(formula.asValue(), equalTo(5.0));
    }

}