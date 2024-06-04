package com.softserve.edu04.hw;

public class HttpCodeNotFountException extends RuntimeException {
    public HttpCodeNotFountException() {
        super("Http code not found");
    }
}
