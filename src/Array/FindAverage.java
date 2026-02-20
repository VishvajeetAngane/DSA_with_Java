package Array;

import java.util.Scanner;

class FindAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        if(size <= 0){
            System.out.println("Invalid size");
            return;
        }

        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + ":");
            arr[i] = input.nextInt();
        }

        System.out.print("Your array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        double sum = 0.0;
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }

        double average = sum / size;

        System.out.println("\nAverage of an array is: " + average);
    }
}
