package taller1;

import java.util.Random;

public class Reto6 {
    public static void main(String[] args) {

        Random Lectura2 = new Random();

        int givenOne = 1 + Lectura2.nextInt(6);
        System.out.println("El resultado del lanzamiento del primer dado es: " + givenOne);
        int givenTwo = 1 + Lectura2.nextInt(6);
        System.out.println("El reusltado del lanzamiento del segundo dado es: " + givenTwo);

        int case2 = givenOne + givenTwo;

        if (givenOne == 1 && givenTwo == 1) {
            System.out.println("En el dado numero uno sacaste " + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + " al sacar un par de unos ganaste, ¡Felicidades!");
        }

        else if (case2 == 3) {

            System.out.println("En el dado numero uno sacaste " + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + " al sacar una total de tres ganaste, ¡Felicidades!");
        } else if (case2 == 11) {
            System.out.println("En el dado numero uno sacaste " + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + " al sacar una total de once ganaste, ¡Felicidades!");
        } else if ((givenOne == 2 && givenTwo == 2) || (givenOne == 12 && givenTwo == 12)) {
            System.out.println("En el dado numero uno sacaste " + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + " al sacar un par de dos o doce ganaste, ¡Felicidades!");
        } else if (case2 == 7) {
            System.out.println("En el dado numero uno sacaste " + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + " al sacar un total de 7 ganaste, ¡Felicidades!");
        } else {
            System.out.println("En el dado numero uno sacaste" + givenOne + " y en el dado numero dos sacaste "
                    + givenTwo + "al no cumplir ninguna de las condiciones usted perdio ");
        }
    }
}
