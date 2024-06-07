package com.softserve.edu07_oop2.exampleInterface;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Sphere(7.2, "MySphere"),
                new Cube(5.8, "MySphere"),
                new Cube(6.7, "MyCube"),
                new Sphere(6.3, "MyCube")
        };

        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println("Shape area for " + shape.getClass().getSimpleName() + " " + area);

            if (shape instanceof Volumetric) {
                double volume = ((Volumetric) shape).getVolume();
                System.out.println("Shape volume for " + shape.getClass().getSimpleName() + " " + volume);
            }
            if (shape instanceof Vertexable) {
                double numberOfVertex = ((Vertexable) shape).getNumberOfVertex();
                System.out.println("Namber of vertex " + shape.getClass().getSimpleName() + " " + numberOfVertex);
            }
        }

    }
}
