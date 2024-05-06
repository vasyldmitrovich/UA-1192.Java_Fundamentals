package com.softserve.edu04.hw;

import static com.softserve.edu04.hw.HTTPFamily.*;

//it should be expanded to HTTPCode Enum
public enum HTTPError {
    BAD_REQUEST(400, CLIENT_ERROR),
    UNAUTHORIZED(401, CLIENT_ERROR),
    FORBIDDEN(403, CLIENT_ERROR),
    NOT_FOUND(404, CLIENT_ERROR),
    INTERNAL_SERVER(500, SERVER_ERROR),
    NOT_IMPLEMENTED(501, SERVER_ERROR);

    private final int errorCode;
    //family in status OR statuses array in family
    private final HTTPFamily family;

    public static HTTPError of(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (error.errorCode == errorCode) {
                return error;
            }
        }
        return null;
    }

    HTTPError(int errorCode, HTTPFamily family) {
        this.errorCode = errorCode;
        this.family = family;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public HTTPFamily getFamily() {
        return family;
    }
}
