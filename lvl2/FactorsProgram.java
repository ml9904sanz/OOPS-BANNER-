package lvl2;

import java.util.Scanner;

public class FactorsProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum: " + getSum(factors));
        System.out.println("Product: " + getProduct(factors));
        System.out.println("Sum of Squares: " + getSumOfSquares(factors));
    }

    static int[] getFactors(int n) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static int getProduct(int[] arr) {
        int product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }
}
