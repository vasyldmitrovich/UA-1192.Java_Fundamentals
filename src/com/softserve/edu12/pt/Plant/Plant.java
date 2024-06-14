package com.softserve.edu12.pt.Plant;


import com.softserve.edu12.pt.PracticalTask;

import java.util.Arrays;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException, SizeException, NullPointerException {
        checkSize(size);
        checkNull(typeStr);
        checkNull(colorStr);
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public static Type typeStrToEnum(String typeStr) throws TypeException {
        for (Type type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input type from list: " + Arrays.toString(Type.values()));
    }

    public static Color colorStrToEnum(String colorStr) throws ColorException {

        for (Color color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input color from list: " + Arrays.toString(Color.values()));
    }

    @Override
    public String toString() {
        return "This is a plant of type %s of color %s of size %d".
                formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }

    public static Plant readFromConsole() {

        var scanner = PracticalTask.SCANNER;
        while (true) {
            try {
                System.out.println("Enter plant parameters.");
                System.out.println("Enter type: ");
                String typeStr = scanner.nextLine();
                System.out.println("Enter color: ");
                String colorStr = scanner.nextLine();
                System.out.println("Enter size: ");
                int size = Integer.parseInt(scanner.nextLine());
                return new Plant(typeStr, colorStr, size);
            } catch (NullPointerException es) {
                System.out.println(es.getMessage());
            } catch (SizeException | ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println("Size should be a number");
            }
        }
    }

    private void checkSize(int size) throws SizeException {
        if (size < 1 || size > 120) {
            throw new SizeException("Plant size not fit in [1;120] plese enter valid size");
        }
    }

    private void checkNull(Object object) throws NullPointerException {

        if (object == null) {
            throw new NullPointerException("Input must be not null");
        }
    }

}
