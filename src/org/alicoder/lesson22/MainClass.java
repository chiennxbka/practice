package org.alicoder.lesson22;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        Information<String> string = new Information<>("hello");
        System.out.println(string.getValue());

        List<String> strings = new ArrayList<>();
        Set<Integer> integers = new HashSet<>();
        Map<String, Object> objectMap = new HashMap<>();
    }
}
