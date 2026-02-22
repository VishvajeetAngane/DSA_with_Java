package Array;

import java.util.Scanner;

class RightRotateByOnePosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");
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

        System.out.print("Original array is:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[size - 1];

        for(int i = size-2; i >= 0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        System.out.print("\nRight rotated array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
