package taller1;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) throws Exception{ //es un  metodo
        Scanner compra=new Scanner (System.in);  //compra es un objeto de la calse escanner
        System.out.println("Digite el precio de los productos");
        int price=compra.nextInt();
        System.out.println("¿Cual es la cantidad de productos que lleva?");
        int things=compra.nextInt();
        int buy=price*things;
        System.out.println("El valor de la compra es:"+buy);
        System.out.println("Ingrese el  valor con el que paga:");
        int fullValue=compra.nextInt();
        int change=fullValue-buy;
        System.out.println("Su cambio es:"+change);
        compra.close();
    }
}
