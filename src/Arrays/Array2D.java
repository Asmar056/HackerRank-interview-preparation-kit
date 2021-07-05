package Arrays;

import java.util.Scanner;

public class Array2D {
    public static int hourglassSum(int[][] arr) {
        // Write your code here
       int maxValue = Integer.MIN_VALUE;
       int width = arr[0].length-2;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < width; j++) {
                maxValue = Math.max(maxValue,
                        arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]
                );
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Maximum sum " + hourglassSum(arr));
    }
}

