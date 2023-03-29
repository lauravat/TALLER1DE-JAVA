package principal;

import salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona lectura = new Persona();
        lectura.pedirDatos();
        lectura.mostrarDatos();
        lectura.calcularIMC();
        lectura.mayorEdad();

        //se llama al metodo 

        Persona laura=new Persona();
        laura.pedirDatos();
        laura.mostrarDatos();
        laura.calcularIMC();
        laura.mayorEdad();

    }
    
}
