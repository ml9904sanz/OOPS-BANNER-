package lvl2;
import java.util.Scanner;

public class NaturalSumProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results match ✔");
        } else {
            System.out.println("Mismatch ✘");
        }
    }

    static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}