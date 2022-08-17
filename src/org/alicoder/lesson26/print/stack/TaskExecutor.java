package org.alicoder.lesson26.print.stack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    public static void main(String[] args) {
        PrintTask task1 = new PrintTask("task 1");
        PrintTask task2 = new PrintTask("task 2");
        PrintTask task3 = new PrintTask("task 3");
        PrintTask task4 = new PrintTask("task 4");

        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);

        executorService.shutdown();
    }
}
