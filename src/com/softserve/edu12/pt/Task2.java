package com.softserve.edu12.pt;

class Task3 {
    public static void main(String[] args) {// Ok
        try {
            Plant plant1 = new Plant(5, Color.RED, Type.FLOWER);
            Plant plant2 = new Plant(7, Color.BLUE, Type.TREE);

            Plant plant3 = new Plant(3, Color.YELLOW, Type.SHRUB);
            // Plant plant3 = new Plant(3, Color.YELLOW, Type.SHRUB);
            Plant plant4 = new Plant(8, Color.GREEN, Type.TREE);
            //Plant plant4 = new Plant(8, Color.GREEN, Type.TREE);
            Plant plant5 = new Plant(2, Color.RED, Type.FLOWER);

        } catch (ColorException | TypeException | IllegalArgumentException e) {
            System.out.println("something is wrong under time creating plant: " + e.getMessage());
        }
    }
}
