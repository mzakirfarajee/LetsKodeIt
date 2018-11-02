package TestNGPackage;

import org.testng.annotations.Test;

public class TestNGclassTest {

    @Test
    public void testMethod1() {
            SomeClassToTest obj = new SomeClassToTest();
            int result = obj.sumNumbers(1, 6);
            System.out.println("This is First Method");
            System.out.println("The result is = " + result);
    }

    @Test
    public void testMethod2() {
            System.out.println("This is Second Method");
    }

    @Test
    public void testMethod3() {
        System.out.println("This is Third Method");
    }
}