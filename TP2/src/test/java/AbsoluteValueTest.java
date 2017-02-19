/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class AbsoluteValueTest {
    @Test
    public void asString() throws Exception {
        Formula formula = new AbsoluteValue(new Variable("x", -5));
        assertThat(formula.asString(), equalTo("|x|"));
    }

    @Test
    public void asValue() throws Exception {
        Formula formula = new AbsoluteValue(new Variable("x", -5));
        assertThat(formula.asValue(), equalTo(5.0));
    }

}