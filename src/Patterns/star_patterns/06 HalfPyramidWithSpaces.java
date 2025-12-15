package Patterns.star_patterns;

import java.util.Scanner;

class HalfPyramidWithSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Enter the number of rows:");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > i; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
