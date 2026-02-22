package Array;

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome!!!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        if(size <= 0){
            System.out.println("Invalid size");
            return;
        }
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter value for index " + i + ":");
            arr[i] = input.nextInt();
        }

        System.out.println("Your original array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + ", ");
        }

        int start = 0;
        int end = size-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr [end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("\nReversed array:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
