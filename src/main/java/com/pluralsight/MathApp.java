package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 2000;
        double garySalary = 1950;

        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("==========================================");

        double carPrice = 5999.99;
        double truckPrice = 7399.99;

        double smallestPrice = Math.min(carPrice,truckPrice);

        System.out.println( "The smallest price is " + smallestPrice);



    }
}
