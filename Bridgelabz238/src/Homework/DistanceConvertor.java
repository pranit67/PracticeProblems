package Homework;

import java.util.Scanner;

public class DistanceConvertor {
    public static void main(String[] args) {
        System.out.println("Please provide the distance (in km)");
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();
        double metre = distance * 1000;
        double centimetre = distance * 100000;
        double inch = distance * 39270.1;
        System.out.println(distance + " km is equal to " + metre + " metre.");
        System.out.println(distance + " km is equal to " + centimetre + " cm.");
        System.out.println(distance + " km is equal to " + inch + " inches.");
    }
}
