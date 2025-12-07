package Patterns.star_patterns;

import java.util.Scanner;

/*

for user input num = 4
*
* *
* * *
* * * *

 */
class HalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Enter the number of rows:");
        int row = input.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
