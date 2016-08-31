package nl.concertzender.salsa.epgdirect;

/**
 * Version 1.0, 31-8-2016 by LvdA .
 */
public class WPManager {
    public static void main(String[] args) {
        WPManager wpm = new WPManager();
        System.out.println(wpm.speak());
    }

    public String speak() {
        return "Hello World";
    }
}
