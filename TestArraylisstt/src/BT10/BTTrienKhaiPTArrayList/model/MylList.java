package BT10.BTTrienKhaiPTArrayList.model;

import java.util.Arrays;

public class MylList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MylList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MylList(int capacity) {
        Object[] elements = new Object[capacity];
    }

    private void ensureCapa() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > elements.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        // ensureCapa();
//        for (int i = size; i >index ; i--) {              // thêm theo vị trí index ko duyệt mảng mới
//            elements[i] = elements[i-1];
//        }
//        elements[index]= element;


        Object[] newElements = new Object[elements.length + 1];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newElements[i] = elements[i];
            }
            if (i == index) {
                newElements[i] = element;
            }
            if (i > index) {
                newElements[i + 1] = elements[i];
            }
        }
        elements = newElements;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        E result = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return result;
    }

    public int getSize() {
        return size;
    }


    public E[] clone() {
        E[] newElements = (E[]) new Object[size];
        for (int i = 0; i < size - 1; i++) {
            newElements[i] = (E) elements[i];
        }
        return newElements;
    }

//    public boolean contains(E o) {
//
//    }
//
//    public int indexOf(E e) {
//
//    }
//}
}