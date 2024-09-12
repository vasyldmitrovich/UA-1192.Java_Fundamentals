package com.softserve.edu12.pt12.pt2;

public class Main {
    public static void main(String[] args) {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(100, Color.RED, Type.FLOWER);
            plants[1] = new Plant(200, Color.GREEN, Type.TREE);
            plants[2] = new Plant(300, Color.BLUE, Type.SHRUB);
            plants[3] = new Plant(400, Color.YELLOW, Type.VINE);
            plants[4] = new Plant(500, Color.ORANGE, Type.GRASS);

            for (Plant plant : plants) {
                System.out.println(plant);
            }

        } catch (ColorException | TypeException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
