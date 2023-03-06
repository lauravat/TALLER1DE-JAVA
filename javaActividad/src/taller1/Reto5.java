package taller1;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digite su primer nombre: ");
        String Name = Lectura.nextLine();
        System.out.println("Digite su primer apelllido");
        String lastName = Lectura.nextLine();
        //
        int numberName = Name.length();
        System.out.println("La longitud de su primer nombre es: " + numberName);

        int numberLast = lastName.length();
        System.out.println("La longitud de su primer apellido es: " + numberLast);
        //

        System.out.println("Su nombre en minusculas es: " + Name.toLowerCase());
        System.out.println("Su apellido en mayusculas es: " + lastName.toUpperCase());
        //

        String fullName = Name + " " + lastName;
        System.out.println("Su nombre completo es: " + fullName);
        //

        String lettersTwo = Name.substring(0, 2);
        String letters = lettersTwo + lastName;
        System.out.println("La union de las dos primeras letras de su nombre y su apellido completo es: " + letters);
        Lectura.close();
    }

}
