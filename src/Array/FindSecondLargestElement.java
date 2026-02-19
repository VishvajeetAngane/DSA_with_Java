package Array;

import java.util.Scanner;

class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter value for index " + i + ":");
            arr[i] = input.nextInt();
        }

        System.out.print("Your array: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int largest = -1;
        int secondLargest = -1;
        for(int i = 0; i < size; i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest element is: " + secondLargest);
    }
}
