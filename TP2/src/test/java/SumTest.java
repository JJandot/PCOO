/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class SumTest {
    @org.junit.Test
    public void asString() throws Exception {
        Sum sum = new Sum(new Variable("x", 5), new Variable("y", 5));
        assertThat(sum.asString(), equalTo("(x+y)"));
    }

    @org.junit.Test
    public void asValue() throws Exception {
        Sum sum = new Sum(new Variable("x", 5), new Variable("y", 5));
        assertThat(sum.asValue(), equalTo(10.0));
    }

}