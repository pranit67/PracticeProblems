package Homework;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Basic details Of candidate
        System.out.println("Please Enter Your Name");
        String name = scan.nextLine();
        System.out.println("Please Enter Your Class");
        int standard = scan.nextInt();
        System.out.println("Please Enter Your Section");
        char section = scan.next().charAt(0);

        //Marks of Candidate
        System.out.println("Please Enter Your English Marks out of 100");
        int marks1 = scan.nextInt();
        System.out.println("Please Enter Your Maths Marks out of 100");
        int marks2 = scan.nextInt();
        System.out.println("Please Enter Your Physics Marks out of 100");
        int marks3 = scan.nextInt();
        System.out.println("Please Enter Your Biology Marks out of 100");
        int marks4 = scan.nextInt();
        System.out.println("Please Enter Your Chemistry Marks out of 100");
        int marks5 = scan.nextInt();

        double percentage = (marks1+marks2+marks3+marks4+marks5)/5.0;
        System.out.println(name+" from class "+standard+" section "+section+ " has got overall "+percentage+ "%.");

    }
}
