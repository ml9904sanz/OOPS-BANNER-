package lvl1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) {
                break;
            }

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            arr[index] = num;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println("Value: " + arr[i]);
            total += arr[i];
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}
