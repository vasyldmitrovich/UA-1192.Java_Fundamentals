package com.softserve.edu12_excep.pt;

import java.util.Objects;

public class Plant {

    private int size;
    Color color;// Make private fields
    Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        this.size = size;

        if (color == null) {
            throw new ColorException("Incorrect plant color!");
        }

        this.color = color;

        if (type == null) {
            throw new TypeException("Incorrect plant type!");
        }

            this.type = type;
        }

        public int getSize () {
            return size;
        }

        public void setSize ( int size){
            this.size = size;
        }

        public Color getColor () {
            return color;
        }

        public void setColor (Color color){
            this.color = color;
        }

        public Type getType () {
            return type;
        }

        public void setType (Type type){
            this.type = type;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Plant plant = (Plant) o;
            return size == plant.size && color == plant.color && type == plant.type;
        }

        @Override
        public int hashCode () {
            return Objects.hash(size, color, type);
        }

        @Override
        public String toString () {
            return "Plant{" +
                    "size=" + size +
                    ", color=" + color +
                    ", type=" + type +
                    '}';
        }
    }
