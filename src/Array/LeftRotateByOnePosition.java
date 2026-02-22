package Array;

import java.util.Scanner;

class LeftRotateByOnePosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");

        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        if(size <= 0){
            System.out.println("Invalid size");
            return;
        }

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Original array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[0];

        for(int i = 1; i < size; i++){
            arr[i-1] = arr[i];
        }

        arr[size-1] = temp;

        System.out.print("\nLeft rotated array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
