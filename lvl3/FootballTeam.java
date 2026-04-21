package lvl3;

import java.util.Random;

class FootballTeam {

    // Generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }
        return heights;
    }

    // Sum of heights
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // Tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void display(int[] arr) {
        System.out.print("Heights: ");
        for (int h : arr) {
            System.out.print(h + " ");
        }
        System.out.println();
    }
}
    

