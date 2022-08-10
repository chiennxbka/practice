package org.alicoder.lesson23.quiz.q3;

import java.util.Arrays;
import java.util.List;

public class Stack<E> {
    private E[] elements;
    private int size;

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public boolean isFull() {
        return false;
    }

    public E peak() {
        return this.getElements()[0];
    }

    public void push(E value) {
        // them phan tu vao element
        List<E> eList = Arrays.asList(this.getElements());
        eList.add(value);
        this.setElements((E[]) eList.toArray());
    }

    public E pop() {
        return this.getElements()[size - 1];
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public int getSize() {
        return getElements().length;
    }
}
