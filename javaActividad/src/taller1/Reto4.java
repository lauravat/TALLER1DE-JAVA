package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) throws Exception {
        Scanner play1 = new Scanner(System.in);
        Random play2 = new Random();
        System.out.println("Inserte 1 si elige tijeras. 2 para papel, 3 para piedra");
        int option1 = play1.nextInt();
        System.out.println("La opción que has elegido es: " + option1);
        int option2 = 1 + play2.nextInt(3);
        System.out.println("La opción que ha elegido tu rival es:" + option2);
        if (option1 == 1 && option2 == 1) { // casos donde hay un empate
            System.out.println("Elegiste la misma opción de tu contricante, intentalo de nuevo ¡Empate!");
        } else if (option1 == 2 && option2 == 2) {
            System.out.println("Elegiste la misma opción de tu contricante, intentalo de nuevo ¡Empate!");
        } else if (option1 == 3 && option2 == 3) {
            System.out.println("Elegiste la misma opción de tu contricante, intentalo de nuevo ¡Empate!");
        } else if (option1 == 1 && option2 == 2) // casos donde gana el usuario
        {
            System.out.println("Elegiste una opción que derroto a la opción de tu rival ¡Ganaste!");
        } else if (option1 == 2 && option2 == 3) {
            System.out.println("Elegiste una opción que derroto a la opción de tu rival ¡Ganaste!");
        } else if (option1 == 3 && option2 == 1) {
            System.out.println("Elegiste una opción que derroto a la opción de tu rival ¡Ganaste!");
        } else if (option1 == 2 && option2 == 1) { // casos donde pierde el usuario
            System.out.println("Oh no, tu rival ha elegido una mejor opción que la tuya, ¡Pierdes :c! ");
        } else if (option1 == 3 && option2 == 2) {
            System.out.println("Oh no, tu rival ha elegido una mejor opción que la tuya, ¡Pierdes :c! ");
        } else if (option1 == 1 && option2 == 3) {
            System.out.println("Oh no, tu rival ha elegido una mejor opción que la tuya, ¡Pierdes :c! ");
        } else {
            System.out.println(
                    "No cumple ninguna condición, por lo tanto no es valido, digite un nuevo valor nuevamente entre 1-3");
        }
        play1.close();
    }
}
