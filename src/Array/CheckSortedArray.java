package Array;

import java.util.Scanner;

class CheckSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + " :");
            arr[i] = input.nextInt();
        }

        if(size <= 1){
            System.out.println("Array is sorted!!!");
            return;
        }

        System.out.println("Original array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        boolean isSorted = true;

        for(int i = 0; i < size-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }

        }

        if(isSorted){
            System.out.println("\nArray is sorted!!!");
        }
        else{
            System.out.println("\nArray is not sorted!!!");
        }

    }
}
