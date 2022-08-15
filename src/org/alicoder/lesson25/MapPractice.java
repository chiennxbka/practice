package org.alicoder.lesson25;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<Integer, Book> mapBooks = new HashMap<>();
        // put day 1 cap gia tri vao map
        Book bk  = new Book(400, "The gioi phang v3", 2006, "Jone Nguyen");
        mapBooks.put(1, new Book(100, "Dac Nhan Tam", 2021, "Dale Carnegie"));
        mapBooks.put(2, new Book(200, "The gioi phang", 2002, "Jone Nguyen"));
        mapBooks.put(4, new Book(300, "The gioi phang v2", 2004, "Jone Nguyen"));
        mapBooks.put(5, bk);
        System.out.println(mapBooks);
        // Lấy một phần tử trong HashMap
        System.out.println(mapBooks.get(1));

        //Xóa một phần tử trong Map
        mapBooks.remove(4);
        System.out.println(mapBooks);

        for (Integer index: mapBooks.keySet()){
            System.out.println(mapBooks.get(index));
        }

        // Kiểm tra Map có chứa key đã tồn tại chưa
        boolean exist  = mapBooks.containsKey(5);
        System.out.println(exist);

        // Kiểm tra Map có chứa giá trị đã tồn tại chưa
        boolean valueExist = mapBooks.containsValue(bk);
        System.out.println(valueExist);

        // Thêm các phần tử từ một HashMap khác
        Map<Integer, Book> bookMap = new HashMap<>();
        bookMap.putAll(mapBooks);

        // lay ra kich thuoc cua map
        System.out.println(mapBooks.size());
    }
}
