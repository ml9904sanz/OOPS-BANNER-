package lvl3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if (number == 0) {
            count = 1;
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}