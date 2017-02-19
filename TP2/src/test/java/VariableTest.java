/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class VariableTest {
    @Test
    public void asString() throws Exception {
        Variable variable = new Variable("x", 5);
        assertThat(variable.asString(), equalTo("x"));
    }

    @Test
    public void asValue() throws Exception {
        Variable variable = new Variable("x", 5);
        assertThat(variable.asValue(), equalTo(5.0));
    }

    @Test
    public void set() throws Exception {
        Variable variable = new Variable("x", 5);
        variable.set(10);
        assertThat(variable.asValue(), equalTo(10.0));
    }

}