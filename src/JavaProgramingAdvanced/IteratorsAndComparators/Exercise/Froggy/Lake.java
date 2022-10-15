package JavaProgramingAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> list;

    public Lake(List<Integer> list) {
        this.list = list;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }


    public class Frog implements Iterator<Integer> {
        private int index = 0;
        private boolean firstRoundFinished = false;

        @Override
        public boolean hasNext() {
            return !(index >= list.size());
        }

        @Override
        public Integer next() {
            Integer element = list.get(index);
            index += 2;
            if (index >= list.size() && !firstRoundFinished) {
                index = 1;
                firstRoundFinished = true;
            }
            return element;
        }
    }
}
