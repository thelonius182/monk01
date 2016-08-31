package nl.concertzender.salsa.epgdirect.tests;

import nl.concertzender.salsa.epgdirect.WPManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Version 1.0, 31-8-2016 by LvdA .
 */
public class WPManagerTest {

    private static WPManager wpm;

    @BeforeClass
    public static void createWpm() throws Exception {
        wpm = new WPManager();
    }

    @AfterClass
    public static void disableWpm() throws Exception {
        wpm = null;
    }

    @Test
    public void speak() throws Exception {
        assertEquals(wpm.speak(), "Hello World");
    }
}
