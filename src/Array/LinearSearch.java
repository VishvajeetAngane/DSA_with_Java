package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        System.out.print("Original array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter the key: ");
        int key = input.nextInt();

        int result = search(arr,key);

        if(result == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element is found at index " + result);
        }
    }

    public static int search(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
