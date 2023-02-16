import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura =new Scanner(System.in); //para hacer la lectura
        System.out.println("Ingrese dos numeros"); //la x es solo una extensión,NO hace parte del codigo
        int numberOne=lectura.nextInt();
        int numberTwo=lectura.nextInt();
        int result=numberOne+numberTwo;
        System.out.println("Los numeros ingresados son:"+numberOne+" y "+numberTwo);
        System.out.println("La suma de los dos numeros digitados es:"+result);
        lectura.nextLine();//Limpieza buffer
        System.out.println("Ingrese su nombre:");
        String name=lectura.nextLine();
        System.out.println("Su nombre es:"+name);
        lectura.close(); //para cerrar la lectura
        System.out.println("¡Hola!"+name+" ingresaste los números "+numberOne+" y "+numberTwo+", su suma es "+result);
    }
}

