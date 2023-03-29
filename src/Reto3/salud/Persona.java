package Reto3.salud;

import java.util.Scanner;

public class Persona {
    // atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private float peso;
    private double estatura;
    private int edad;
    private String sexo;

    //
    double pesoActual = 0;

    private Scanner lectura = new Scanner(System.in);

    // metodos
    public void pedirDatos() {
        // cuerpo metodo
        System.out.println("Ingrese su tipo de documento: ");
        tipoDoc = lectura.nextLine();
        System.out.println("Ingrese su numero de documento: ");
        documento = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = lectura.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = lectura.nextLine();
        System.out.println("Ingrese su peso: ");
        peso = lectura.nextFloat();
        System.out.println("Ingrese su estatura: ");
        estatura = lectura.nextFloat();
        System.out.println("Ingrese su edad: ");
        edad = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su sexo: ");
        sexo = lectura.nextLine();
    }

    public void mostrarDatos() {
        // cuerpo metodo
        System.out.println("Su tipo de documento es: " + this.tipoDoc + ", su numero de documento es: " + this.documento
                + ", su nombre es: " + this.nombre + ", su apellido es: " + apellido + ", su peso es: " + peso
                + " su estatura es: " + estatura + ", su edad es: " + this.edad + " y por ultimo su sexo es: "
                + this.sexo);
    }

    public void calcularIMC() {
        pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " esta por debajo de lo ideal");
        } else if (pesoActual >= 20 || pesoActual <= 25) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " es ideal");
        } else if (pesoActual > 25) {
            System.out.println("De acuerdo a su IMC: " + pesoActual + " usted tiene sobrepeso");

        }
    }

    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad ");

        } else {
            System.out.println("Usted es menor de edad ");
        }
    }

    // Metodo constructor
    public Persona() {

    }

    public Persona(String tDocumento, int doc, String name, String lastName, float p, Double estat, int age,
            String sex) {
        tipoDoc = tDocumento;
        documento = doc;
        nombre = name;
        apellido = lastName;
        peso = p;
        estatura = estat;
        edad = age;
        sexo = sex;
    }
}
