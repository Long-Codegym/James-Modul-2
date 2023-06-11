package BT11DSAStackQueue;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyQueue<E> implements Queue<E> {
    private LinkedList<E> list = new LinkedList<>();


    @Override
    public boolean add(E e) {
        return list.add(e);
    }

    @Override
    public boolean offer(E e) {
        return list.offer(e);
    }

    @Override
    public E remove() {
        return list.remove();
    }

    @Override
    public E poll() {
        return list.poll();
    }

    @Override
    public E element() {
        return list.element();
    }

    @Override
    public E peek() {
        return list.peek();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return Queue.super.removeIf(filter);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Queue.super.spliterator();
    }

    @Override
    public Stream<E> stream() {
        return Queue.super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return Queue.super.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Queue.super.forEach(action);
    }
}
