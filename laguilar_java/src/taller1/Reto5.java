package taller1;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite un numero:");
        int number1= lectura.nextInt();
        System.out.println("Digite otro numero:");
        int number2=lectura.nextInt();
        if (number1>number2) {
            System.out.println("el numero " +number1+ " es mayor que el numero 2");
           int resultAddition=number1+number2;
           System.out.println("El resultado de la suma es: "+resultAddition); 
           if(resultAddition>0)
           {
            System.out.println("El resultado "+resultAddition+ " es positivo");
           }
           else if(resultAddition<0)
           {
            System.out.println("El resultado "+resultAddition+ " es negativo");
           }
           else if(resultAddition==0)
           {
            System.out.println("El resultado "+resultAddition+ " es neutro");
           }
        }
        else if (number2>number1){
            System.out.println("El numero " +number2+ " es mayor que el " +number1);
            int resultSubtract=number2-number1;
            System.out.println("El resultado de la resta es: "+resultSubtract);
            if(resultSubtract>0)
           {
            System.out.println("El resultado "+resultSubtract+ " es positivo");
           }
           else if(resultSubtract<0)
           {
            System.out.println("El resultado "+resultSubtract+ " es negativo");
           }
           else if(resultSubtract==0)
           {
            System.out.println("El resultado "+resultSubtract+ " es neutro");
           }
        }
        else {
            System.out.println("Los numeros digitados " +number1+" y "+number2+ " son iguales");
            int result=number1*number2;
            System.out.println("El resultado de la multiplicaión es: " +result);
            if(result>0)
           {
            System.out.println("El resultado "+result+ " es positivo");
           }
           else if(result<0)
           {
            System.out.println("El resultado "+result+ " es negativo");
           }
           else if(result==0)
           {
            System.out.println("El resultado "+result+ " es neutro");
           }
        }
        lectura.close();
    }
    
}
