package com.softserve.edu04.hw;

public enum HTTPError {

    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed"),
    ERROR_500("Internal Server Error"),
    ERROR_501("Not Implemented"),
    ERROR_502("Bad Gateway"),
    ERROR_503("Service Unavailable");

    private final String description;

    HTTPError(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
