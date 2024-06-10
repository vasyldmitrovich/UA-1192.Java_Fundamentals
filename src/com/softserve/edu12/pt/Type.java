package com.softserve.edu12.pt;

public enum Type {
    ROSE("Rose"), TULIP("Tulip"), BAMBOO("Bamboo"), FERN("Fern"), MOSS("Moss");

    private final String type;

    Type(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
