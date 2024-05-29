package com.softserve.edu06.pt.pt3;

public class ColorLine extends Line {
        private String color;

    public ColorLine(Point point1, Point point2, String color) {
            super(point1, point2);
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public void print() {
            System.out.println("ColorLine: " + getPoint1() + " to " + getPoint2() + ", color: " + color);
        }

        @Override
        public String toString() {
            return "ColorLine{" +
                    "point1=" + getPoint1() +
                    ", point2=" + getPoint2() +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
