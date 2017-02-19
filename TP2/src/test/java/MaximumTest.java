/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class MaximumTest {
    @Test
    public void asString() throws Exception {
        Formula formula = new Maximum(new Variable[]{new Variable("x", 5.0), new Variable("y", 6.0), new Variable("z", 3.0)});
        assertThat(formula.asString(), equalTo("{x,y,z}"));
    }

    @Test
    public void asValue() throws Exception {
        Formula formula = new Maximum(new Variable[]{new Variable("x", 5.0), new Variable("y", 6.0), new Variable("z", 3.0)});
        assertThat(formula.asValue(), equalTo(6.0));
    }

}