/*
     1
    1 2
   1 2 3
  1 2 3 4

 */

package Patterns.number_patterns;

import java.util.Scanner;

class The_Palindromic_Number_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
