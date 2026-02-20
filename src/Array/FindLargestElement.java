package Array;

import java.util.Scanner;

class FindLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");

        System.out.print("Please enter the size of an array: ");
        int size = input.nextInt();

        if(size <= 0){
            System.out.println("Invalid size");
            return;
        }

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("value for index " + i +" = ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];

        for(int i = 1; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("\nMaximum element is:" + max);
    }
}
