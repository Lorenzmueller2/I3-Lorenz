package ch.tbz;

import java.util.Scanner;

public class I3 {

    public static int A = 2021;

    /***
     * Main Methode zum starten des programms
     * @param args übergabeparameter vom System
     */
    public static void main(String[] args) {

        int [] age = new int[5];
        int [] age2 = new int[5];
        int count = 0;

        Scanner eingabewert = new Scanner(System.in);


        while (count <= 4) {

            System.out.println("Geben Sie ihr Geburtsjahr ein: ");
            age[count] = eingabewert.nextInt();
            count++;
        }


        for (int i = 0; i < age.length; i++) {

            age2[i] = A - age[i];

            if (age2[i] >= 18) {
                System.out.println("Sie sind "+(age2[i])+" Jahre alt und Volljährig.");
            } else {
                System.out.println("Du sind "+(age2[i])+" Jahre alt und Minderjährig.");
            }
        }




    }
}
