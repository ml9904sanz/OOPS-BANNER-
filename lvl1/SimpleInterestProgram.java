package lvl1;

import java.util.Scanner;

public class SimpleInterestProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }

    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
