import java.util.Random;
import java.util.Scanner;

public class tarea {
public static void main(String[] args) {
    Scanner coin1 = new Scanner(System.in);
    Random option2 = new Random();
    System.out.println("Escriba cual de las dos opciones desea eligir, 1 si es cara, 2 si es sello");
    int option1=coin1.nextInt();
    int coin2 = 1+ option2.nextInt(2);
    System.out.println(coin2);
    if (option1==coin2) {
        System.out.println("¡Ganaste!");
        
    } else {
        System.out.println("Perdiste :c ");
        
    }
    coin1.close();
}
}