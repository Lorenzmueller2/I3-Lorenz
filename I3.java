package ch.tbz;

import java.util.Scanner;

public class I3 {

    public static int A = 2021;

    public static void main(String[] args) {
        int B = 0;

        Scanner eingabewert = new Scanner(System.in);

        System.out.println("Geben Sie ihr Geburtsjahr ein: ");
        B = eingabewert.nextInt();

        int sum = A - B;

        if (B < A ) {
            System.out.println("Sie sind "+sum+" Jahre alt");
        } else {
            System.out.println("Sie haben ein nicht mögliches Geburtsjahr angegeben. ");
        }








    }
}