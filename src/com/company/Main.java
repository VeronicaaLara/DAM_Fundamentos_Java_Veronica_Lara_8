package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Pedir dos numeros, mostrarlos ordenados de mayor a menor.

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("En orden es" +numero1+ "," +numero2);
        }
        if (numero1 < numero2) {
            System.out.println("En orden es" +numero2+ "," +numero1);

            sc.close();
        }

    }
}