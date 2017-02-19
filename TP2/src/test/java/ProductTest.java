/*
 * Copyright (c)
 */

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class ProductTest {

    @org.junit.Test
    public void asString() throws Exception {
        Product product = new Product(new Variable("x", 5), new Variable("y", 5));
        assertThat(product.asString(), equalTo("(x*y)"));
    }

    @org.junit.Test
    public void asValue() throws Exception {
        Product product = new Product(new Variable("x", 5), new Variable("y", 5));
        assertThat(product.asValue(), equalTo(25.0));
    }

}