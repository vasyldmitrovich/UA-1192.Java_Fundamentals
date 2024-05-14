package com.softserve.edu09.wrapper;

public class Service<T extends IEntity> {

    public int work(T t) {
        int i = t.getId();
        return i;
    }
}
