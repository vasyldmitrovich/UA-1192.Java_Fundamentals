package com.softserve.edu12.pt.pt2;

public class App {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant(5, Color.RED, Type.FLOWER);
            plants[1] = new Plant(11, Color.BLUE, Type.TREE);
            plants[2] = new Plant(3, Color.YELLOW, Type.SHRUB);

            for (Plant plant : plants) {
                plant.validateSize();
                plant.validateColorAndType();
                System.out.println(plant);
            }
        } catch (SizeException e) {
            System.out.println("SizeException: " + e.getMessage());
        } catch (ColorException e) {
            System.out.println("ColorException: " + e.getMessage());
        } catch (TypeException e) {
            System.out.println("TypeException: " + e.getMessage());
        }
    }
}