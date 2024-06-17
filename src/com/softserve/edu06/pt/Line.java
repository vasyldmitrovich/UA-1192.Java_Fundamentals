package com.softserve.edu06.pt;

public class Line {
        private Point start;
        private Point end;

        public Line(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Line from " + start + " to " + end;
        }

        public void print() {
            System.out.println(toString());
        }
}
