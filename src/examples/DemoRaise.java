package examples;

import java.util.Scanner;

public class DemoRaise {
    public static void main(String[] args){



    double salary;
    System.out.println("Demonstrating some raises:");

    System.out.print("What is your Salary >>>");
    Scanner input = new Scanner(System.in);
    salary = input.nextDouble();
    predictRaises(salary);

    }
    public static void predictRaises(double salary){
        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;




        System.out.println("Current salary: " + salary + "\nAfter raise: " + newSalary);
    }






}
