package Homework;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        System.out.println("Please insert a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int square = number * number;
        int cube = number * number * number;
        System.out.println("Square of "+number+ " is "+square);
        System.out.println("Cube of "+number+ " is "+cube);
    }
}