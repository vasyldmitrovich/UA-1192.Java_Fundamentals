package ratio.softserve.academy.hw;

import java.util.HashMap;

public abstract class AbstractHomeWork implements HomeWorkInterface {

    HashMap<Integer, Runnable> steps = new HashMap<>();

    @Override
    public HashMap<Integer, Runnable> getSteps() {
        return steps;
    }
}
