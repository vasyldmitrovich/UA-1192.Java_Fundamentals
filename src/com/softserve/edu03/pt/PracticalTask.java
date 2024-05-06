package com.softserve.edu03.pt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask {

    public static void main(String[] args)  throws IOException {
/*    Practical task 1

      Info for user. Asking for input a number       */
        System.out.println("Enter the first number: ");

//    Calling a method getNumber() which take a number from the user.
        int num1 = getNumber();

//    Info for user. Asking for input a second number;
        System.out.println("Enter the second number: ");
//    Calling method getNumber() again.
        int num2 = getNumber();

//    Calling a method getTotal() which output to us total sum of both numbers from user.
        getTotal(num1,num2);
//    Calling a method getAverage() which output to us average number of both numbers from user.
        getAverage(num1,num2);

/*     Practical task 2
       Created 3 objects of type "Employee"
 */
        Employee employee1 = new Employee("Rostyslav",60, 100);
        Employee employee2 = new Employee("Ivan",70, 90);
        Employee employee3 = new Employee("Vasyl",85, 100);

        //    Calling method getTotalSum to dispaly the total salary of all created objects;
        System.out.println("Total salary of all employes is: " + (Employee.totalSum = employee1.getTotalSum()
                +employee2.getTotalSum()+employee3.getTotalSum()));


    }
    //    Created getTotal method to get a sum of both numbers which input by user;
    public static int  getTotal(int a, int b){
        int res = a + b;
        System.out.println("The sum of " + a + " and "+ b + " is: " + res);
        return res;

    }
    //   Created getAverage method to get average number of both numbers which input by user;
    public static double getAverage(double a, double b){
        double res = a+b;
        System.out.println("The average of " + a + " and "+ b + " is: " + res/2);
        return res;
    }

    //   Created getNumber method to get numbers from user;
    public static int getNumber() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        return number;

    }

}