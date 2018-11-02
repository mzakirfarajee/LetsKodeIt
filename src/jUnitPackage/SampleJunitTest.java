package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleJunitTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");

    }

    @Test
    public void test1() {
        System.out.println("+++Test 1");
    }

    @Test
    public void test2() {
        System.out.println("+++Test 1");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");

    }
}
