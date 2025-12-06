package Patterns.number_patterns;

import java.util.Scanner;

/*
for user input num = 4
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */
class NumberSquarePattern {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Enter the number:");
        int num = input.nextInt();

        for(int i = 0 ; i < num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
