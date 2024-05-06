package edu04;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("input number day of week: ");
         int day = sc.nextInt();

         String[] daysEnglish = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

         String[] daysUkrainian = {"понеділок", "вівторк", "середа", "четвре", "пятниця" ,"субота", "неділя"};

         if(day >= 1 && day <= 7) {
             System.out.println("day of week is (english): " + daysEnglish[day - 1]);
             System.out.println("дні тижня (Українською): " + daysUkrainian[day - 1]);

         } else {

             System.out.println("illegal day of week. please input number from 1 to 7: ");
         }
         sc.close();
    }
}
