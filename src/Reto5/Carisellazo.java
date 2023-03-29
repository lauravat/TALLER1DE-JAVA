package Reto5;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juego {
    Scanner lectura = new Scanner(System.in);

    Scanner play1 = new Scanner(System.in);
    Random play2 = new Random();
    private String name;
    int option1;
    int option2;
    int numero1 = lectura.nextInt();

    public void iniciar() {
        System.out.println("Ingrese su nombre: ");
        name = lectura.nextLine();
    }

    public void jugar() {
        System.out.println("Inserte 1 si elige tijeras. 2 para papel, 3 para piedra");
        option1 = play1.nextInt();
        option2 = 1 + play2.nextInt(3);
    }

    public void finalizar() {
        if (option1 == 1 && option2 == 1) {
            System.out.println("Empate");
        } else if (option1 == 2 && option2 == 2) {
            System.out.println("Empate");
        }

        else if (option1 == 3 && option2 == 3) {
            System.out.println("Empate");
        } else if (option1 == 1 && option2 == 2) // casos donde gana el usuario
        {
            System.out.println("¡Gano!");
        } else if (option1 == 2 && option2 == 3) {
            System.out.println("¡Gano!");
        } else if (option1 == 3 && option2 == 1) {
            System.out.println("¡Gano!");
        } else if (option1 == 2 && option2 == 1) {
            System.out.println("Pierdes :c ");
        } else if (option1 == 3 && option2 == 2) {
            System.out.println("Pierdes :c ");
        } else if (option1 == 1 && option2 == 3) {
            System.out.println("Pierdes :c ");
        } else {
            System.out.println(
                    "No cumple ninguna condición, por lo tanto no es valido, digite un nuevo valor nuevamente entre 1-3");
        }
    }
}
