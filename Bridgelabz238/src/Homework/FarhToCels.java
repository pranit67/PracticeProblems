package Homework;

import java.util.Scanner;

public class FarhToCels {
    public static void main(String[] args) {
        System.out.println("please provide temperature in fahrenheit");
        Scanner scan = new Scanner(System.in);
        double temp = scan.nextDouble();
        double formula = (temp-32.0)*(5.0/9.0);
        System.out.println(temp+ " fahrenheit is equal to "+formula + " celsius");
    }
}
