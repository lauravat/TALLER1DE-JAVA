package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto9 {
    public static void main(String[] args) {
        Scanner coin1 = new Scanner(System.in);
        Random option2 = new Random();
        int option1 = 0;
        int coin2 = 0;
        int game = 1;
        int bet = 0;
        int bet1 = 0;
        int counter = 0;
        System.out.println("Ingrese la cantidad de dinero que tiene: ");
        int global = coin1.nextInt();
        while (game == 1) {
            System.out.println("Digite la cantidad que desea apostar: ");
            bet = coin1.nextInt();
            System.out.println("Digite cual de las dos opciones desea eligir, 1 si es cara, 2 si es sello");
            option1 = coin1.nextInt();
            System.out.println("la opción que has elegido es: " + option1);
            coin2 = 1 + option2.nextInt(2);
            System.out.println("La opción de la moneda ha sido: " + coin2);

            System.out.println(coin2);
            if (option1 == coin2) {
                bet1 = bet * 2;
                global = global + bet1;
                System.out.println("Duplico su apuesta: " + bet1); // para que sepa cuanto es lo que gano
                System.out.println("¡Ganaste!, ahora tienes : " + global); // y aqui se muestre lo que tiene acumulado

            } else {
                global = global - bet;
                System.out.println("Perdiste, ahora tienes: " + global);
            }
            System.out.println("Quiere volver a jugar?: 1 para si, 2 para no");
            game = coin1.nextInt();
            counter = counter + 1;
        }
        System.out.println("Usted jugo: " + counter);
        System.out.println("Su total es de :" + global);

        coin1.close();

    }
}
