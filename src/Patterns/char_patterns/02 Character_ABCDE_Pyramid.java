/*
A
A B
A B C
A B C D
*/

package Patterns.char_patterns;

import java.util.Scanner;

class Character_ABCDE_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Please enter the rows: ");
        int row = input.nextInt();

        for(int i = 0; i < row; i++){
            char ch = 'A';
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
