package Latihan;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan bilangan pertama : ");
        bilangan[0] = input.nextInt();

        System.out.println("Masukan bilangan kedua : ");
        bilangan[1] = input.nextInt();

        if (bilangan[1] > bilangan[0]) {
            System.out.println(bilangan[1]);
        } else {
            System.out.println(bilangan[0]);
        }
    }
}
