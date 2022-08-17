package org.alicoder.lesson26;

import java.util.Arrays;

public class ThreadMain {

    public static void main(String[] args) {
        MyThread runnable1 = new MyThread();
        MyThread runnable2 = new MyThread();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Arrays.asList(thread1, thread2).parallelStream().forEach(Thread::start);
    }
}
