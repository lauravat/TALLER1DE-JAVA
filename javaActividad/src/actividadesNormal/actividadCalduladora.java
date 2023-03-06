package actividadesNormal;

import java.util.Scanner;

public class actividadCalduladora {
    public static void main(String[] args) {
        Scanner Calculadora = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numberOne= Calculadora.nextInt();
        System.out.println("Digite otro numero: ");
        int numberTwo= Calculadora.nextInt();

        System.out.println("Digite el numero de la opcion que desea elegir:  ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Division");
        System.out.println("5. Potenciación");
        System.out.println("6. Radicación");
        int op = Calculadora.nextInt();

        switch (op) {
            case 1:
            double total=Calculadora.nextDouble();
                total=numberOne + numberTwo;
                System.out.println("El valor de su suma entre los numeros "+numberOne+ "y" +numberTwo+ " es " +total);
                break;
                case 2:
                
                total=numberOne-numberTwo;
                System.out.println("El resultado de la resta entre los numeros " +numberOne+ "y" +numberTwo+ " es " +total);
                break;
                case 3:
                
                total=numberOne*numberTwo;
                System.out.println("El resultado de la multiplicacción entre los numeros " +numberOne+ " y " +numberTwo+ " es " +total);
                break;
                case 4:
                
                total=numberOne/numberTwo;
                System.out.println("El resultado de la división entre los numeros " +numberOne+ " y " +numberTwo+ " es " +total);
                break;
        
                case 5:
                
                total= Math. pow(numberOne, numberTwo);
                System.out.println("El resultado de la potenciacion entre: " +numberOne+ " y " +numberTwo+ " es " +total);
                break;
        
                case 6:
                
                total=Math. sqrt(numberOne);
                System.out.println("El resultado de la radicación del primer numero " +numberOne+  " es " +total);
                total=Math.sqrt(numberTwo);
                System.out.println("El resultado de la radicación el segundo numero " +numberTwo+ " es " +total );
                break;
        
            default:
                break;
        }
        Calculadora.close();
    }
}
