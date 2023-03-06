package actividadesNormal;

import java.util.Scanner;

public class actvTelefonia {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int price, cantidad,subtotal;
        int contador=0;
        int acumulador=0;
        for(int i=1; i<=5; i++){
            System.out.println("Conteo de referencias ingresadas"+i);
            System.out.println("Digite el precio del producto: ");
            price=lectura.nextInt();
            System.out.println("Digite la cantidad de productos:");
            cantidad=lectura.nextInt();
            contador=contador+1;
            subtotal=price*cantidad;
            acumulador=acumulador+subtotal;
        }
        System.out.println("El valor a pagar por su compra es: "+acumulador);
        System.out.println("Digite el valor dle billete con el que va a pagar: ");
        int billete=lectura.nextInt();
        int total= billete-acumulador;
        System.out.println("Su cambio es:" +total);
        System.out.println("¿Cuenta con telefonia movil exito?");
        int answer=lectura.nextInt();
        if (answer==1) {
          System.out.println("Los minutos que usted obtuvo con su compra son: "+acumulador);  
        } else {
            System.out.println("No pierdas más minutos, adquiere ya tu telefonia movil exito");
        }
    }
}

    