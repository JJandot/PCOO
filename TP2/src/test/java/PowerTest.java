/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class PowerTest {
    @Test
    public void asString() throws Exception {
        Formula formula = new Power(new Variable("x", 5), 2);
        assertThat(formula.asString(), equalTo("5.0^2"));
    }

    @Test
    public void asValue() throws Exception {
        Formula formula = new Power(new Variable("x", 2), 3);
        assertThat(formula.asValue(), equalTo(8.0));
    }

}