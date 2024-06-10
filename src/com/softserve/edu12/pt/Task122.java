package com.softserve.edu12.pt;

import java.util.Arrays;

public class Task122 {

    public static void execute() {
        Plant[] plants = new Plant[5];

            plants[0] = createPlant(10, "blue", "bamboo");
            plants[1] = createPlant(1, "purple", "fern");
            plants[2] = createPlant(3, "red", "rose");
            plants[3] = createPlant(37, "white", "ivy");
            plants[4] = createPlant(70, "green", "rose");


        System.out.println(Arrays.toString(plants));
    }

    private static Plant createPlant(int size, String color, String type){
        Plant plant=null;

        try {
            plant = new Plant(size, color, type);
        }catch (SizeException e){
            System.out.println(e.getMessage());
        } catch (TypeException e) {
            System.out.println(e.getMessage());
        } catch (ColorException e) {
            System.out.println(e.getMessage());
        }

        return plant;
    }
}
