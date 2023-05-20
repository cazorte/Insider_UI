package com.utils;

public class BrowserUtils {


    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
