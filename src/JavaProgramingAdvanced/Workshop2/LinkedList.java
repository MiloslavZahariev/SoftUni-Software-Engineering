package JavaProgramingAdvanced.Workshop2;

import java.lang.reflect.Array;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T number) {

        Node<T> newNode = new Node<>(number);
        if (!isEmpty()) {
            newNode.next = head;
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(T number) {
        if (isEmpty()) {
            addFirst(number);
            return;
        }
        Node<T> newNode = new Node<>(number);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }


    public T get(int index) {
        checkIndex(index);
        Node<T> currentNode;
        if (index > size / 2) {
            currentNode = tail;
            for (int i = 0; i < (size - 1) - index; i++) {
                currentNode = currentNode.prev;
            }

        } else {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        }


        return currentNode.value;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't remove from empty list!");
        }
        T result = head.value;
        size--;
        head = head.next;
        if (this.size > 1) {
            head.prev = null;
        }
        if (isEmpty()) {
            head = null;
            tail = null;
        }

        return result;
    }

    public T removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        T result = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return result;
    }

    public void removeFirstValue(T value) {
        Node<T> currentNode = head;
        int counter = 0;
        while (currentNode.next != null) {
            if (currentNode.value.equals(value)) {
                if (counter == size) {
                    removeLast();
                    return;
                }
                if(counter == 0){
                    removeFirst();
                    return;
                }
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                size--;
                return;

            } else {
                currentNode = currentNode.next;
                counter++;
            }

        }
    }


    public T[] toArray(Class<?> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, size);
        int counter = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            arr[counter] = currentNode.value;
            counter++;
            currentNode = currentNode.next;
        }
        return arr;
    }


    private boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize(){
        return this.size;
    }

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("No such index in the list!");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T value = (currentNode.value);
                currentNode = currentNode.next;
                return value;
            }
        };
    }
}
