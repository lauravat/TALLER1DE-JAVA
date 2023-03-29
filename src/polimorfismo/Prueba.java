package polimorfismo;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int option;
        int ejecucion = 8;

        while (ejecucion == 8) {
            System.out.println(
                    "Digite 1 para calcular el area del cuadrado, 2 para el triangulo , 3 para circulo y 4 para rectangulo");
            option = lectura.nextInt();
            switch (option) {
                case 1:
                    Cuadrado c1 = new Cuadrado();
                    System.out.println("Digite el lado del cuadrado: ");
                    float Lado = lectura.nextFloat();
                    c1.setLado(Lado);
                    c1.CalcularArea();
                    break;
                case 2:
                    Triangulo tr1 = new Triangulo();
                    System.out.println("Ingrese la base: ");
                    float Base = lectura.nextFloat();
                    tr1.setBase(Base);
                    System.out.println("Ingrese la altura: ");
                    float Altura = lectura.nextFloat();
                    tr1.setAltura(Altura);
                    tr1.CalcularArea();
                    break;
                case 3:
                    Circulo cr1 = new Circulo();
                    System.out.println("Ingrese unicamente le radio del circulo: ");
                    float radioCirculo = lectura.nextFloat();
                    cr1.setRadio(radioCirculo);
                    cr1.CalcularArea();
                    break;
                case 4:
                    Rectangulo r1 = new Rectangulo();
                    System.out.println("Ingrese la base:");
                    float baseRec = lectura.nextFloat();
                    r1.setBase(baseRec);
                    System.out.println("Ingrese la altura: ");
                    float alturaRec = lectura.nextFloat();
                    r1.setAltura(alturaRec);
                    r1.CalcularArea();
                    break;
                default:
                    System.out.println("Por favor verifique los datos ingresados");
                    break;
            }
            System.out.println("Digite el numero 8 si desea volver a repetir la ejecución si no digite 9: ");
            ejecucion = lectura.nextInt();
        }

        lectura.close();
    }

}
