package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 19 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex19 {
    static Scanner input = new Scanner(System.in);

    public static double numericInputOnly(){
        while(true){
            try {
                return Double.parseDouble(input.nextLine());
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input, please enter a number: ");
            }
        }
    }

    public static double bmiCalc(double height, double weight){
        return (weight / (height * height)) * 703;
    }

    public static void main(String[] args) {

        System.out.print("Enter your height in inches: ");
        double height = numericInputOnly();
        System.out.print("Enter your weight in pounds: ");
        double weight = numericInputOnly();

        double userBMI = bmiCalc(height, weight);
        System.out.println("Your BMI is " + userBMI + ".");

        if(userBMI<18.5){
            System.out.println("You are underweight. You should see your doctor.");
        } else if(userBMI>25){
            System.out.println("You are overweight. You should see your doctor.");
        } else{
            System.out.println("You are within the ideal weight range.");
        }
    }
}
