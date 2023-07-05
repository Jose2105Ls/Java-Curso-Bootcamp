package Ejercicios.GeneradorDeNumero;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        // Pedir al usuario que adivine el número
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Introduce tu intento: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            }
        } while (numeroUsuario != numeroAleatorio);
    }
}
