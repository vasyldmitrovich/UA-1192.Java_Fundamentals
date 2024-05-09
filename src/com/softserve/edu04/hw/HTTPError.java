package com.softserve.edu04.hw;

public enum HTTPError {

    E400("Bad Request"),
    E401("Unauthorized"),
    E402("Payment Required"),
    E403("Forbidden"),
    E404("Not Found"),
    E405("Method Not Allowed"),
    E406("Not Acceptable"),
    E407("Proxy Authentication Required"),
    E408("Request Timeout"),
    E409("Conflict");

    private final String value;

    HTTPError(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
