/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class SquareTest {
    @Test
    public void asString() throws Exception {
        Formula formula = new Square(new Variable("x", 5));
        assertThat(formula.asString(), equalTo("x^2"));
    }

    @Test
    public void asValue() throws Exception {
        Formula formula = new Square(new Variable("x", 5));
        assertThat(formula.asValue(), equalTo(25.0));
    }

}