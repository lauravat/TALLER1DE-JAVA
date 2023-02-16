package taller1;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) throws Exception {
        Scanner bar = new Scanner(System.in);
        System.out.println("Digite su edad:");
        int age= bar.nextInt();
        if (age>=18) {
            System.out.println("Tienes la edad suficiente para entrar, ¡Bienvenido!");
        }
        else {
            System.out.println("No tiene la edad suficiente, no puede ingresar");
        }
        
         bar.close();
    }
}
