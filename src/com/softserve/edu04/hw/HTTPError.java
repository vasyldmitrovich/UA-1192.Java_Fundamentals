package com.softserve.edu04.hw;

public enum HTTPError {
    Error_400("Bad Request"),
    Error_401("Unauthorized"),
    Error_402("Payment Required"),
    Error_403("Forbidden"),
    Error_404("Not Found");

  public String errorDescription;

    HTTPError(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}
