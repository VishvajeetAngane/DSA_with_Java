/*
A
B C
D E F
G H I J
 */

package Patterns.char_patterns;

import java.util.Scanner;

class Continuous_Character_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("please enter the rows: ");
        int row = input.nextInt();

        char ch = 'A';

        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
