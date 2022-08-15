package org.alicoder.lesson25;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionPracticeGUI {

    public static void main(String[] args) {
        // dua ra thong bao cho nguoi dung muon
        // nhap bao nhieu cuon sach

        int soLuong = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập số lượng sách"));
//        int soLuong = new Scanner(System.in).nextInt();


        // for voi so luong cuon sach la so luong nguoi dung nhap
        // Moi vong for se tao ra 1 cuon sach & add vao 1 danh sach(them gia sach)
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= soLuong; i++) {
            String bookName = JOptionPane.showInputDialog("Mời bạn nhập tên cuốn sách thứ " + i);
            int publishYear = Integer.parseInt(JOptionPane.showInputDialog("Mời bạn nhập năm xuất bản cuốn sách thứ " + i));
            String author = JOptionPane.showInputDialog("Mời bạn nhập tác giả cuốn sách thứ " + i);
            books.add(new Book(i, bookName, publishYear, author));
        }

        // them 1 cuon sach dac nhan tam
        books.add(new Book(100, "Đắc Nhân Tâm", 2021, "Dale Carnegie"));

        //tao ra 1 cuon sach bat ki va them vao vi tri thu 3 trong gia sach
        if (books.size() > 2) {
            books.add(3, new Book(200, "Thế giới phẳng", 2002, "Jone Nguyen"));
            // xoa neu phau tu trong danh sach neu no la o vi tri thu 2
            for (int i = 0; i < books.size(); i++) {
                if (i == 1) books.remove(i);
            }
        }

        // su dung java 8 de sap xep danh sach theo thu tu nam xuat ban & in ra
        List<Book> sorted = books.stream().sorted(Comparator.comparing(Book::getPublishYear)).collect(Collectors.toList());
        StringBuffer sortPublishYear = new StringBuffer();
        sorted.forEach(book -> sortPublishYear.append(book.toString()).append("\n"));
        JOptionPane.showMessageDialog(null, sortPublishYear, "Sắp xếp theo năm xuất bản", JOptionPane.INFORMATION_MESSAGE);
        // su dung java 8 sap xep danh sach theo ten sach & in ra
        List<Book> sortedBook = books.stream().sorted(Comparator.comparing(Book::getBookName)).collect(Collectors.toList());
        StringBuffer sortBookName = new StringBuffer();
        sortedBook.forEach(book -> sortBookName.append(book.toString()).append("\n"));
        JOptionPane.showMessageDialog(null, sortBookName, "Sắp xếp theo tên sách", JOptionPane.INFORMATION_MESSAGE);
    }
}
