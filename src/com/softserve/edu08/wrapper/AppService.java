package com.softserve.edu08.wrapper;

public class AppService {
    public static void main(String[] args) {
        Service<UserEntity> s = new Service<>();
        System.out.println("s.work() = " + s.work(new UserEntity()));
    }
}
