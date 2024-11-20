package com.softserve.edu09_10_collec.wrapper;

public class AppService {
    public static void main(String[] args) {
        Service<UserEntity> s = new Service<>();
        System.out.println("s.work() = " + s.work(new UserEntity()));
    }
}
