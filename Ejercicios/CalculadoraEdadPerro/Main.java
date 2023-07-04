package Ejercicios.CalculadoraEdadPerro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad humana al usuario
        System.out.println("Ingrese la edad humana del perro: ");
        int edadHumano = scanner.nextInt();

        // Calcular la edad del perro
        int edadPerro = calcularEdadPerro(edadHumano);

        // Imprimir el resultado
        System.out.println("La edad del perro es aproximadamente " + edadPerro + " años.");
    }

    public static int calcularEdadPerro(int edadHumano) {
        if (edadHumano < 0) {
            System.out.println("La edad humana no puede ser negativa.");
            return 0;
        } else {
            return (edadHumano) * 7;
        }
    }
}
