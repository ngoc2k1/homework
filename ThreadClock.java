package com.ngoc.practice;

import java.text.SimpleDateFormat;

import static java.lang.Thread.sleep;

public class ThreadClock {
    public static void main(String[] args) {
        Runnable timer = new Runnable() {
            @Override
            public void run() {
                do {
                    System.out.println(getCurrentTime());
                    try {
                        sleep(1000);
                    } catch (InterruptedException ignored) {

                    }
                } while (true);
            }
        };
        Thread clock = new Thread(timer);
        clock.start();
    }

    public static String getCurrentTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(System.currentTimeMillis());
    }
}
