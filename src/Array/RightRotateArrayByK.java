package Array;

import java.util.Scanner;

class RightRotateArrayByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for the index " + i + ":");
            arr[i] = input.nextInt();
        }

        System.out.print("Original array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the value of k:");
        int k = input.nextInt();

        k = k % size;

        reverse(arr, 0, size-k-1);

        reverse(arr, size-k, size-1);

        reverse(arr, 0, size-1);

        System.out.print("Right rotate array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
