package lvl3;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        // Step 1: Count digits
        long temp = num;
        int count = 0;

        if (temp == 0) {
            count = 1; // special case for 0
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        // Step 2: Store digits in array
        int[] digits = new int[count];
        temp = num;

        if (num == 0) {
            digits[0] = 0;
        } else {
            int index = 0;
            while (temp != 0) {
                digits[index++] = (int)(temp % 10);
                temp /= 10;
            }
        }

        // Step 3: Frequency array (0–9)
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display result
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " -> " + freq[i] + " times");
            }
        }

        sc.close();
    }
}
