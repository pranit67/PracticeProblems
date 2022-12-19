package Homework;

import java.util.Scanner;

public class CelsToFarh {
    public static void main(String[] args) {
        System.out.println("please provide temperature in celsius");
        Scanner scan = new Scanner(System.in);
        double temp = scan.nextDouble();
        double formula = (temp*(9.0/5.0)+32);
        System.out.println(temp+ " celsius is equal to "+formula + " fahrenheit");
    }
}
