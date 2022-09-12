/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10000)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /* TODO: Write a test case for the method you wrote in IntroLab.
     *       If done properly, you should be able to run IntroLabTest and see
     *       the test results.
     * As a reference, we've included testExampleStudent above.
     */

    @Test(timeout = 10000)
    public void testZhouDav6() {
        String expected = "Hi! My name is David Zhou! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.zhoudav6();
        assertEquals(expected, actual);
    }


    @Test(timeout = 10000)
    public void testlekevi15() {
        String expected = "Howdy! My name is Kevin Le! " +
                "I like cats more than dogs! When I grow up, I will adopt a cat! :)";
        String actual = IntroLab.lekevi15();
        assertEquals(expected, actual);
    }





}
