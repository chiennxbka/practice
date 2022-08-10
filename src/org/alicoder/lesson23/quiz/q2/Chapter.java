package org.alicoder.lesson23.quiz.q2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private int chapterNumber;
    private String title;

    List<Page> pages = new ArrayList<>();

    public Chapter() {
    }

    public Chapter(int chapterNumber, String title) {
        this.chapterNumber = chapterNumber;
        this.title = title;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageOfChapter(){
        return this.pages.size();
    }

    public void addPage(Page page){
        this.pages.add(page);
    }
}
