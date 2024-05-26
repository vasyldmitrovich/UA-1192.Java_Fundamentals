package com.softserve.academy;

import java.util.HashMap;
import java.util.function.Consumer;

public interface HomeWorkInterface extends Consumer<Integer> {

    void accept(Integer step);

    HashMap<Integer, Runnable> getSteps();
}