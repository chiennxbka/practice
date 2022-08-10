package org.alicoder.lesson23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {

    public static void main(String[] args) {
        // demo iterator
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if ("C".equals(element)) {
                iterator.remove();
                continue;
            }
            System.out.println(element);
        }
    }
}
