package org.alicoder.lesson25;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListPractice {

    public static void main(String[] args) {
        // dua ra thong bao cho nguoi dung muon
        // nhap bao nhieu cuon sach

        System.out.println("Moi ban nhap so luong sach");
        int soLuong = new Scanner(System.in).nextInt();


        // for voi so luong cuon sach la so luong nguoi dung nhap
        // Moi vong for se tao ra 1 cuon sach & add vao 1 danh sach(them gia sach)
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= soLuong; i++) {
            System.out.println("Moi ban nhap ten cuon sach thu: " + i);
            String bookName = new Scanner(System.in).nextLine();
            System.out.println("Moi ban nhap nam xuat ban cuon sach thu: " + i);
            int publishYear = new Scanner(System.in).nextInt();
            System.out.println("Moi ban nhap ten tac gia cuon sach thu: " + i);
            String author = new Scanner(System.in).nextLine();
            books.add(new Book(i, bookName, publishYear, author));
        }

        // them 1 cuon sach dac nhan tam
        books.add(new Book(100, "Dac Nhan Tam", 2021, "Dale Carnegie"));

        //tao ra 1 cuon sach bat ki va them vao vi tri thu 3 trong gia sach
        if (books.size() > 2) {
            books.add(3, new Book(200, "The gioi phang", 2002, "Jone Nguyen"));
            // xoa neu phau tu trong danh sach neu no la o vi tri thu 2
            for (int i = 0; i < books.size(); i++) {
                if (i == 1) books.remove(i);
            }
        }

        // su dung java 8 de sap xep danh sach theo thu tu nam xuat ban & in ra
        System.out.println("Sap xep theo nam xuat ban");
        books.stream().sorted(Comparator.comparing(Book::getPublishYear)).forEach(System.out::println);

        // su dung java 8 sap xep danh sach theo ten sach & in ra
        System.out.println("Sap xep theo ten sach");
        books.stream().sorted(Comparator.comparing(Book::getBookName)).forEach(System.out::println);
    }
}
