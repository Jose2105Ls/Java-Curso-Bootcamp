package Ejercicios.CalculadoraDePropina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Calculadora de propinas--");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto total a pagar : ");
        double totalCuenta = sc.nextDouble();

        System.out.println("Ingrese el porcentaje(%) de propina que desea dejar : ");
        double porcemtajePropina = sc.nextDouble();

        double propina = totalCuenta * (porcemtajePropina / 100);

        System.out.println("La propina es de : " + "s/ " + propina);
    }
}
