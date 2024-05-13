package com.softserve.edu04.hwork;

public enum HTTPError {// Ok
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    PAYMENT_REQUIRED(402, "Payment Required"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405,"Method Not Allowed")
    ;

    private final int code;
    private final String name;

    HTTPError(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static HTTPError getByCode(int code) {
        return switch (code) {
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORIZED;
            case 402 -> PAYMENT_REQUIRED;
            case 403 -> FORBIDDEN;
            case 404 -> NOT_FOUND;
            case 405 -> METHOD_NOT_ALLOWED;

            default -> throw new IllegalArgumentException("Unknown error " + code);

        };
    }

    public String getName() {
        return name;
    }
}

