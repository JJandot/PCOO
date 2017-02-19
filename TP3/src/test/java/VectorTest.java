import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.junit.Test;

public class VectorTest {

    @Test
    public void testVectorInt() {
        Vector<Integer> vector = new Vector<>(123);
        assertThat(vector.capacity(), equalTo(123));
        assertThat(vector.size(), equalTo(0));
    }

    @Test
    public void testVector() {
        Vector<Integer> vector = new Vector<>();
        assertThat(vector.capacity(), equalTo(10));
        assertThat(vector.size(), equalTo(0));
    }

    @Test
    public void testEnsureCapacity_CapacityDoubled() {
        Vector<Integer> vector = new Vector<>(23);
        vector.ensureCapacity(24);
        assertThat(vector.capacity(), greaterThanOrEqualTo(23*2));
    }

    @Test
    public void testEnsureCapacity_CapacitySatisfied() {
        Vector<Integer> vector = new Vector<>(23);
        vector.ensureCapacity(120);
        assertThat(vector.capacity(), greaterThanOrEqualTo(120));
    }

    @Test
    public void testEnsureCapacity_CapacityAlwaysIncreased() {
        Vector<Integer> vector = new Vector<>(120);
        vector.ensureCapacity(10);
        assertThat(vector.capacity(), equalTo(120));
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testResize() {
        Vector<Integer> vector = new Vector<>();
        vector.resize(120);
        assertThat(vector.capacity(), equalTo(120));
        vector.resize(-2);
        assertThat(vector.capacity(), not(-2));
    }



    @Test
    public void testResize_Zeros() {
        Vector<Integer> vector = new Vector<>(1);
        vector.add(2);
        vector.resize(0);
        vector.resize(1);
        assertThat(vector.get(0), Matchers.<Object>equalTo(0));
    }

    @Test
    public void testResize_CapacityIncreased() {
        Vector<Integer> vector = new Vector<>(1);
        vector.resize(15);
        assertThat(vector.get(10), greaterThanOrEqualTo(0));
    }

    @Test
    public void testResize_CapacityAlwaysIncreased() {
        Vector<Integer> vector = new Vector<>(15);
        vector.resize(2);
        assertThat(vector.get(10), equalTo(null));
    }

    @Test
    public void testIsEmpty() {
        Vector<Integer> vector = new Vector<>();
        assertThat(vector.isEmpty(), equalTo(true));
        vector.resize(12);
        assertThat(vector.isEmpty(), equalTo(false));
    }

    @Test
    public void testAdd() {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(13);
        vector.add(10);
        assertThat(vector.size(), equalTo(3));
        assertThat(vector.get(0), equalTo(12));
        assertThat(vector.get(1), equalTo(13));
        assertThat(vector.get(2), equalTo(10));
        vector.resize(1);
        vector.add(2);
        assertThat(vector.size(), equalTo(2));

    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testSet() {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(13);
        vector.add(10);
        vector.set(0, 2);
        vector.set(2, 4);
        vector.set(3, 123);
        vector.set(42, 42);

        assertThat(vector.get(0), equalTo(2));
        assertThat(vector.get(2), equalTo(4));
        assertThat(vector.get(3), equalTo(123));
        assertThat(vector.get(42), not(42));
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testGet() {
        Vector<Integer> vector = new Vector<>();
        vector.add(12);
        vector.add(13);
        assertThat(vector.get(0), equalTo(12));
        assertThat(vector.get(50), equalTo(null));
    }

}