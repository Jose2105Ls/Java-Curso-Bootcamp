package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);

        //Peso en KG / altura en metros al cuadrado
        System.out.println("Ingrese su peso en KG");
        double peso = cargaDeDatos.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = cargaDeDatos.nextDouble();
        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es : " + indiceMasaCorporal);

        // Mayor a 30 -> Obesidad
        if (indiceMasaCorporal >= 30) {
            System.out.println("Estas Obeso.");
        }
        // Entre 25 y 30 sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Tienes Sobrepeso.");
        }
        // Entre 18.5 y 25 normal
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            System.out.println("Estas normal.");
        }
        // Menor a 18.6 debajo de o normal
        if (indiceMasaCorporal < 18.6) {
            System.out.println("Estas debajo de lo normal.");
        }

       /* System.out.println("¿Que edad tienes?");
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        */
    }

}
