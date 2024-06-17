package com.softserve.edu06.pt;

public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        public void print() {
            System.out.println(toString());
        }
}
