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

        System.out.println("The smalllest price is " + smallestPrice);


        System.out.println("==========================================");

        double radius = 7.25;
        double area;

        area = Math.pow(radius , 2) * Math.PI;

        System.out.println("The area of a circle is " + area);

        System.out.println("==========================================");

        double square = Math.sqrt(5);

        System.out.println("The square root is " + square);

        System.out.println("==========================================");

        double distance = Math.sqrt(Math.pow((5 - 85), 2) + Math.pow(( 10 - 50), 2));

        // Source - https://stackoverflow.com/a/32047473
        // Posted by Bob, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-04-08, License - CC BY-SA 3.0

        // double distance = Math.hypot(5 - 85, 10 - 50);

        System.out.println(distance);

        System.out.println("==========================================");

        double absolute = -3.8;

        System.out.println("The absolute of "+ absolute +" is "+ Math.abs(absolute));

        System.out.println("==========================================");

        System.out.println(Math.random());









    }
}
