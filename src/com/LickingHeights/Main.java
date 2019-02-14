package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard =new Scanner(System.in);
	    //initialize
       String name ="Please type your name here";
       int heightFeet = keyboard.nextLine(), heightInches =8, weightpounds = 1;

       int  heightinFeet = heightFeet,heightinInches= heightInches,weightInPounds = weightpounds;
       double feetToMeters = 0.3048,inchesToMeters = 0.0254,poundsToKilograms = 0.453592;
       System.out.println((heightinFeet*feetToMeters));
        System.out.println((heightinFeet*feetToMeters)+(heightinInches*inchesToMeters));

       double heightInMeters = ((heightinFeet*feetToMeters)+(heightinInches*inchesToMeters));
       double weightInKilograms =weightInPounds*poundsToKilograms;
       double bmi =weightInKilograms/(heightInMeters* heightInMeters);

       System.out.println("Hello "+(name)+", my name is Dante.");
       System.out.println("Today I will be helping you find your body mass index.");
       System.out.println("I will need your weight in pounds, and your height in feet and inches.");
       System.out.println("Your Body Mass Index is "+(Math.round(bmi))+".");
        if (bmi<18.5)
            System.out.println("Your body mass index is considered underweight.");
        else if (bmi<25)
            System.out.println("Your body mass index is considered normal.");
        else if (bmi>30)
            System.out.println("Your body mass index is considered overweight.");






    }
}
