package Array;

import java.util.Scanner;

class FindSecondLargestElement {
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

        System.out.print("Your array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < size; i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("\nNOT FOUND SECOND LARGEST ELEMENT!!!");
        }
        else{
            System.out.println("\nSecond largest element is: " + secondLargest);
        }
    }
}
