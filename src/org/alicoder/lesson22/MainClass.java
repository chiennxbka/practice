package org.alicoder.lesson22;

public class MainClass {

    public static void main(String[] args) {
        Information<String> string = new Information<>("hello");
        System.out.println(string.getValue());
    }
}
