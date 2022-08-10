package org.alicoder.lesson23.quiz.q2;

import java.util.ArrayList;
import java.util.List;

public class Quiz2main {

    public static void main(String[] args) {
        List<Page> pages = new ArrayList<>();
        Chapter chapter1 = new Chapter(1, "Lam sao de tro nen gioi hon");
        Chapter chapter2 = new Chapter(2, "De song hanh phuc hon");
        Chapter chapter3 = new Chapter(3, "Loi thu toi ngot ngao");
        for (int i = 1; i <= 50; i++) {
            pages.add(new Page(i));
        }
        // da co 50 page
        for (int i = 0; i < pages.size(); i++) {
            if (i <= 14) chapter1.addPage(pages.get(i));
            else if (i <= 29) chapter2.addPage(pages.get(i));
            else chapter3.addPage(pages.get(i));
        }
        Book book = new Book("Tuoi tre dang gia bao nhieu", "NXB Tong hop", 2021);
        book.addChapter(chapter1);
        book.addChapter(chapter2);
        book.addChapter(chapter3);
        System.out.println("Ten sach:" + book.getName());
        System.out.println("NXB:" + book.getIsbn());
        System.out.println("Nam xuat ban:" + book.getPublishYear());
        System.out.println("Tong so chuong:" + book.getChapterOfBook());
        System.out.println("Tong so trang sach:" + book.getTotalPageOfBook());
    }
}
