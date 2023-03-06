package taller1;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura =new Scanner(System.in);
        System.out.println("Digite los grados fahrenheit que desea convertir: ");
        int fahrenheit=lectura.nextInt();
        double result=(fahrenheit-32)/1.8;
        System.out.println("Los grados fahrenheit en centigrados son:"+result);
        lectura.close();
    }
}
