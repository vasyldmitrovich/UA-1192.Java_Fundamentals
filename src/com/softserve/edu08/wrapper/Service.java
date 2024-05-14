package com.softserve.edu08.wrapper;

public class Service<T extends IEntity> {

    public int work(T t) {
        int i = t.getId();
        return i;
    }
}
