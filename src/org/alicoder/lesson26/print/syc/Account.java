package org.alicoder.lesson26.print.syc;

public class Account {

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    // synchronized lock đối tượng và tránh việc tranh đoạt dữa liệu
    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;
        try {
            Thread.sleep(20);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        balance = newBalance;
    }
}
