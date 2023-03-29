package Reto3.salud;

import java.util.Scanner;

public class Empleado extends Persona {
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;

    Scanner lectura = new Scanner(System.in);

    // encapsulamiento se hace con variables en privado y herencia

    public void pedirDatos2() {
        super.pedirDatos();
        System.out.println("Ingrese su cargo: ");
        cargo = lectura.nextLine();
        System.out.println("Digite valor de la hora trabajada: ");
        valorHora = lectura.nextInt();
        System.out.println("Digite la cantidad de horas trabajadas: ");
        horasTrabajadas = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese el departamento en el que trabaja: ");
        departamento = lectura.nextLine();
    }

    public double calcularHonorarios() {
        double honorarios = (horasTrabajadas * valorHora) - (1 - 0.00966);
        return honorarios; // se devuelve un solo valor
    }

    public void mostrarDatos2() {
        super.mostrarDatos();
        System.out.println("El cargo que usted digito es: " + cargo + ", el departamento en el que usted trabaja es: "
                + departamento + "sus horas trabajadas son: " + horasTrabajadas
                + ", el valor por hora trabajada es: " + valorHora + ", su valor total es de: " + calcularHonorarios());
    }
}