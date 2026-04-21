package lvl3;

class NumberCheckerExtended {

    // Sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares
    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = NumberChecker.getDigits(num);
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    // Frequency of digits
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void displayFrequency(int[][] freq) {
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}