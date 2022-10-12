package JavaProgramingAdvanced.Workshop2;

import java.lang.reflect.Array;
import java.util.function.Consumer;

public class LinkedList<T> {

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

    public void forEach(Consumer<T> consumer) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public T[] toArray(Class<?> clazz) {
        T[] arr = (T[]) Array.newInstance( clazz, size);
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

    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("No such index in the list!");
        }
    }
}
