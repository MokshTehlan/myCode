package com.company;
import java.util.Scanner;
class KilometerConverter {

    public static void main(String[] args){
        Scanner km = new Scanner(System.in);
        System.out.println("kilometer to miles converter:-)");
        System.out.println("Enter the kilometers here:- ");
        float kilo = km.nextFloat();
        double miles = kilo*(0.621371);
        System.out.println("Total Miles in "+kilo+" Kilometers are:- "+ miles+ " miles");
    }
}
