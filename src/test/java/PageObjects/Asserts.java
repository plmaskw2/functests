package PageObjects;

import org.junit.Assert;

public class Asserts extends Assert {

    public static void assertEquals(String text, Object expected, Object actual){
        assertEquals(expected, actual);
        System.out.println(text + " -> Correct");
    }

    public static void assertTrue(String text, boolean condition){
        assertTrue(condition);
        System.out.println(text + " -> Correct");
    }

    public static void assertFalse(String text, boolean condition) {
        assertFalse(condition);
        System.out.println(text + " -> Correct");
    }
}
