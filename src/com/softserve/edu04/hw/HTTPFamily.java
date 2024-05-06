package com.softserve.edu04.hw;

public enum HTTPFamily {
    INFORMATION(1),
    SUCCESS(2),
    REDIRECT(3),
    CLIENT_ERROR(4),
    SERVER_ERROR(5);

    private final int familyCode;

    HTTPFamily(int familyCode) {
        this.familyCode = familyCode;
    }

    public int getFamilyCode() {
        return familyCode;
    }
}
