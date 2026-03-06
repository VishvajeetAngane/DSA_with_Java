package Array;

import java.util.Scanner;

class LeaderElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("\nOriginal array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int max = arr[size-1];
        System.out.print("\nLeaders: ");
        System.out.print(max + " ");
        for(int i = size-2; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
