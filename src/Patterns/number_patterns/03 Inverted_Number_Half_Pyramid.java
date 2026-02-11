/*
1 2 3 4
1 2 3
1 2
1
*/

package Patterns.number_patterns;

import java.util.Scanner;

class Inverted_Number_Half_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
