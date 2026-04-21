import java.util.Scanner;

public class TriangleRunProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);

        System.out.println("Number of rounds to complete 5km run: " + rounds);
    }

    static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double totalDistance = 5000; // meters

        return (int) Math.ceil(totalDistance / perimeter);
    }
}