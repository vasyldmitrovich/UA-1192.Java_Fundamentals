package com.softserve.edu04.hw;

public enum HTTPError {// Ok
    ERROR_400("Bad request"),ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),ERROR_403("Forbidden"),
    ERROR_404("Not Found"),ERROR_405("Method not Allowed"),
    ERROR_406("Not Acceptable"),ERROR_407("Proxy Authentication Required "),
    ERROR_408("Request Timeout"),ERROR_409("Conflict"),
    ERROR_410("Gone");
    private final String name;
    HTTPError(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
