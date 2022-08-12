package org.alicoder.lesson24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Fundament {

    public static void main(String[] args) {
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Hoang Lan", 25, "Osaka"));
        peoples.add(new Person("Thuy Dung", 20, "Tokyo"));
        peoples.add(new Person("Viet Anh", 22, "Hirosima"));
        peoples.add(new Person("Dinh Hoa", 18, "Osaka"));
        peoples.add(new Person("Anh Diu", 16, "Tokyo"));
        peoples.add(new Person("Quynh Anh", 18, "Osaka"));
        peoples.add(new Person("Thien Phuong", 24, "Fukuoka"));
        peoples.add(new Person("Yen", 26, "Tokyo"));
        peoples.add(new Person("Van Duong", 21, "Fukuoka"));

        /*forach
        in ra toan bo thong tin people*/
        System.out.println("in ra toan bo thong tin people");
        peoples.forEach(person -> System.out.println(person.toString()));

        // tuong duong voi
        /*for (Person person: peoples) {
            System.out.println(person.toString());
        }*/

        /*map
        Tạo ra các giá trị mới từ dữ liệu hiện có, hoặc có thể là các dữ liệu thành phần*/
        System.out.println("Tạo ra các giá trị mới từ dữ liệu hiện có, hoặc có thể là các dữ liệu thành phần");
        Stream.of(3, 5, 7) // tạo ra Stream từ List<Integer>
                .map(i -> "alicoder-" + i) // biến đổi từng phần tử thành String
                .map(String::toUpperCase) // biến đổi từng phần tử thành Upper case
                .forEach(System.out::println); // in ra xem thử

        peoples.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);

        /*Filter
         loc ra các đối tượng thỏa mãn điều kiện*/

        // loc ra những people co do tuoi < 20
        System.out.println("loc ra những people co do tuoi < 20");
        peoples.stream().filter(person -> person.getAge() < 20).forEach(person -> System.out.println(person.getName()));

        /*limit

        lay ra gioi hạn các phần từ của collection*/
        System.out.println("lay ra gioi hạn các phần từ của collection");

        peoples.stream().limit(5).forEach(person -> System.out.println(person.getName()));

        /*sort. sắp xếp theo tieu chí nào đó*/
        System.out.println("Sắp xếp theo mot thuoc tính trong collection");
        peoples.stream().map(Person::getName).sorted().forEach(System.out::println);

        System.out.println("Sắp xếp cả collection");
        peoples.sort(Comparator.comparing(Person::getAge));
        peoples.forEach(person -> System.out.println(person.toString()));

        peoples.stream().sorted(Person::compareTo).forEach(System.out::println);

        /*collect dữ liệu
        collect giúp chúng ta lấy toàn bộ dữ liệu đã biến đổi trong Stream thành đối tượng mình mong muốn*/

        Set<String> stringSet = peoples.stream().map(Person::getAddress).collect(Collectors.toSet());
        List<String> stringList = peoples.stream().map(Person::getAddress).distinct().collect(Collectors.toList());

        System.out.println(1);
    }
}
