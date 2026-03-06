package Array;

import java.util.Scanner;

class MoveZerosToEnd {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("\nOriginal array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        moveZerosToEnd(arr);

        System.out.print("\nUpdated array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
    }
}
