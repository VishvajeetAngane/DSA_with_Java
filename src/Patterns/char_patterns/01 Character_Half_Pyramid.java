/*
A
B B
C C C
 */

package Patterns.char_patterns;

import java.util.Scanner;

class Character_Half_Pyramid {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Please enter the rows: ");
        int row = input.nextInt();

        char ch = 'A';

        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
