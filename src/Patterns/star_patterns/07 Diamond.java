package Patterns.star_patterns;

import java.util.Scanner;

class Diamond {
    public static void main(String[] args) {
        System.out.println("Welcome!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int row = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = row; i >= 1; i--){
            for(int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
