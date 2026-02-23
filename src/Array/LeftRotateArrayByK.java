package Array;

import java.util.Scanner;

class LeftRotateArrayByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the value of K (positions to rotate): ");
        int k = input.nextInt();

        k = k % size;

        reverse(arr, 0, k - 1);

        reverse(arr, k, size - 1);

        reverse(arr, 0, size - 1);

        System.out.print("\nLeft Rotated array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}