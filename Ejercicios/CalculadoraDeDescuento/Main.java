package Ejercicios.CalculadoraDeDescuento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Calculadora de descuento--");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese precio del producto : ");
        double precioOriginal = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de Descuento : ");
        double descuento = sc.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio Final con descuento es: " + precioFinal);

    }
}
