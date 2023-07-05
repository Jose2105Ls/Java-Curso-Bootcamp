package Ejercicios.ConversorMillasKilometros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("--Conversor de Millas a Kilometros--");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de millas: ");
        double millas = sc.nextDouble();

        double kilometros = millas * 1.6094;
        System.out.println("Tus millas equivale a : " + kilometros + " kilometros" );
    }
}
