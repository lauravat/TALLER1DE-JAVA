package Reto2.principal;

import Reto2.salud.Persona;

public class Inicio {
    public static void main(String[] args) {

        // se llama al metodo

        Persona laura = new Persona();
        laura.pedirDatos();
        laura.mostrarDatos();

        double pesoActual = laura.calcularIMC();
        if (pesoActual < 20) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " esta por debajo de lo ideal");
        } else if (pesoActual >= 20 || pesoActual <= 25) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " es ideal");
        } else if (pesoActual > 25) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " usted tiene sobrepeso");

        }

        laura.mayorEdad();

    }

}
