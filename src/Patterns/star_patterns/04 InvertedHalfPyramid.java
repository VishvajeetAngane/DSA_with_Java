package Patterns.star_patterns;

import java.util.Scanner;
/*

* * * *
* * *
* *
*

*/

class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Enter the number of rows:");
        int row = input.nextInt();

//        for(int i = row; i > 0; i--){
//            for(int j = i; j > 0; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= row; i++){
            for(int j = row; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
