package Homework;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please provide the number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int output = number % 2;
         if (output == 0){
             System.out.println(number+ " is even number.");
         }else {
             System.out.println(number + " is odd number.");
         }
    }
}
