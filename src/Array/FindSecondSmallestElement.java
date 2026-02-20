package Array;

import java.util.Scanner;

class FindSecondSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");

        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        if(size == 0){
            System.out.println("Invalid size");
            return;
        }

        for(int i = 0; i < size; i++){
            System.out.print("Enter the value for index " + i + ":");
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < size; i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] > min && arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("\nNo second smallest element found.");
        } else {
            System.out.println("\nSecond smallest element is: " + secondMin);
        }

    }
}
