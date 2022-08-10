package org.alicoder.lesson23.quiz.q2;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;

    private String isbn;

    private int publishYear;

    private List<Chapter> chapters = new ArrayList<>();

    public Book() {
    }

    public Book(String name, String isbn, int publishYear) {
        this.name = name;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int getChapterOfBook(){
        return this.chapters.size();
    }

    public void addChapter(Chapter chapter){
        this.chapters.add(chapter);
    }

    public int getTotalPageOfBook(){
        int pages = 0;
        for (Chapter chapter: chapters){
            pages += chapter.getPageOfChapter();
        }
        return pages;
    }
}
