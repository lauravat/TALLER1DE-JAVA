package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner coin1 = new Scanner(System.in);
        Random option2 = new Random();
        System.out.println("Escriba cual de las dos opciones desea eligir, 1 si es cara, 2 si es sello");

        int option1 = coin1.nextInt();
        System.out.println("la opción que has elegido es: " + option1);
        int coin2 = 1 + option2.nextInt(2);
        System.out.println("La opción de la moneda ha sido: " + coin2);
        if (option1 == coin2) {
            System.out.println("Tu elección coincide con el resultado ¡Ganaste!");

        } else {
            System.out.println("Tu elección no es la misma que el resultado obtenido, perdiste :c ");

        }
        coin1.close();
    }
}