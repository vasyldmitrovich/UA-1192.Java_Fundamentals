package com.softserve.edu16_io.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileInput {
    public static void main(String[] args) throws InterruptedException {
        byte[] r = new byte[100];
        String fileName = "c:/Tools/1/test.txt";
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            //
            //int count = inFile.read(r, 0, bytesAv);
            //
            int count = 0;
            for (int i = 0; ; i++) {
                int b = inFile.read();
                if (b < 0) {
                    break;
                }
                r[i] = (byte) b;
                count = (i + 1);
            }
            //
            System.out.println("Was readed: " + count + " bytes.");
            for (int i = 0; i < bytesAv; i++) {
                System.out.print(r[i] + " ");
            }
            System.out.println();
            //System.out.println(r[0] + " " + r[1] + " " + r[2]);
            for (int i = 0; i < bytesAv; i++) {
                //System.out.print((char) r[i] + " ");
                System.out.print(" " + (char) r[i]);
                Thread.sleep(1000);
            }
            System.out.println();
            //System.out.println((char) r[0] + " " + (char) r[1] + " " + (char) r[2]);
            //
            inFile.close();
            System.out.println("Input stream was closed.");
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
        System.out.println("Array: " + Arrays.toString(r));
    }
}
