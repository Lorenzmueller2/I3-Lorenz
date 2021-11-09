package ch.tbz;

import java.util.Scanner;

public class I3 {

    public static int A = 2021;

    public static void main(String[] args) {
        int B = 0;

        Scanner eingabewert = new Scanner(System.in);

        //Fordert dein Geburtsjahr ein
        System.out.println("Geben Sie ihr Geburtsjahr ein: ");
        B = eingabewert.nextInt();

        //Rechnet das Alter ein
        int sum = A - B;

        //Ist die Ausgabe
        if (B < A ) {
            System.out.println("Sie sind "+sum+" Jahre alt");
        } else {
            System.out.println("Sie haben ein ungültiges Geburtsjahr angegeben. ");
        }








    }
}