package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard =new Scanner(System.in);
	    //initialize
       String name ="Please type your name here";
       String heightFeet;
       int heightInFeet,heightInInches;
       int weightPounds;

        System.out.println("Hello my name is Dante, today I will be helping you find your body mass index.");
        System.out.println("What is your height in feet?");
        heightInFeet = keyboard.nextInt();
        System.out.println("What is you height in inches?");
        heightInInches = keyboard.nextInt();
        System.out.println("What is your weight in pounds?");
        weightPounds = keyboard.nextInt();




        double feetToMeters = 0.3048,inchesToMeters = 0.0254,poundsToKilograms = 0.453592;
        double heightInMeters = ((heightInFeet*feetToMeters)+(heightInInches*inchesToMeters));
        double weightInKilograms =weightPounds*poundsToKilograms;
        double bmi =weightInKilograms/(heightInMeters* heightInMeters);







       System.out.println("Your Body Mass Index is "+(Math.round(bmi))+".");
        if (bmi<18.5)
            System.out.println("Your body mass index is considered underweight.");
        else if (bmi<25)
            System.out.println("Your body mass index is considered normal.");
        else if (bmi>30)
            System.out.println("Your body mass index is considered overweight.");






    }
}
