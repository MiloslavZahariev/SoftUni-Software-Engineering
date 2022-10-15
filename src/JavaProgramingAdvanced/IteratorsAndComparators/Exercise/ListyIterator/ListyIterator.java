package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.ArrayList;
import java.util.List;

public class ListyIterator {


    public List<String> list = new ArrayList<>();
    public int internalIndex;

    public void create(String... strings) {
        this.list = List.of(strings);
    }

    public boolean hasNext() {
        if (internalIndex < list.size() - 1) {
            return true;
        }
        return false;
    }

    public boolean move() {
        if (hasNext()) {
            internalIndex++;
            return true;
        }

        return false;
    }

    public void print() {
        isEmptyList();
        System.out.println(list.get(internalIndex));
    }

    public void printAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


    private void isEmptyList() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
    }
}
