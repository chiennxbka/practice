package org.alicoder.lesson22;

public class Information<E> {

    private E value;

    public Information(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }
}
