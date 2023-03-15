package principal;

import salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona lectura = new Persona();
        /*lectura.pedirDatos();
        lectura.mostrarDatos();
        lectura.calcularIMC();
        lectura.mayorEdad();
        */
        Persona laura=new Persona("Tarjeta de identidad", 1031648594, "Laura", "Aguilar", 44, 1.55, 17, "Femenino");
        laura.mostrarDatos();
    }
    
}
