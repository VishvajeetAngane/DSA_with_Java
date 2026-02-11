package Patterns.number_patterns;

import java.util.Scanner;

/*
1
1 2
1 2 3
*/

class Number_Half_Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!!!");
        System.out.print("Please enter number: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
