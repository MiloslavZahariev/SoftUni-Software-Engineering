package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stack implements Iterable<Integer> {
    private Node head;
    private int size;


    public void push(String input) {
        List<Integer> listToPush = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer toPush : listToPush) {
            Node newNode = new Node(toPush);
            if (!isEmpty()) {
                newNode.next = head;
            }
            head = newNode;
            size++;
        }

    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("No elements");
            return;
        }
        head = head.next;
        size--;
    }


    private boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public Integer next() {
                int value = currentNode.value;
                currentNode = currentNode.next;
                return value;
            }
        };
    }
}
