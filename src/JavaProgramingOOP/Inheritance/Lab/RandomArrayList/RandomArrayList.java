package JavaProgramingOOP.Inheritance.Lab.RandomArrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {

    public Object getRandomElement() {
        int int_random = ThreadLocalRandom.current().nextInt(0, size());
        return get(int_random);
    }
}
