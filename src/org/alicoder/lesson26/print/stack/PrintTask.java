package org.alicoder.lesson26.print.stack;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

    private final String taskName;

    private final int sleepTime;

    private static final SecureRandom generator = new SecureRandom();

    public PrintTask(String taskName) {
        this.taskName = taskName;
        this.sleepTime = generator.nextInt(3000);
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
            Thread.sleep(sleepTime);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
