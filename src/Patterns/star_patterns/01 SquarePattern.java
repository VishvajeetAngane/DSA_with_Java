package Patterns.star_patterns;

import java.util.Scanner;

class SquarePattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome!!!");
        System.out.print("Enter number:");
        int num = input.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
