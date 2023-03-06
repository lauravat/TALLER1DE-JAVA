package Arrays.Retos;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese cual es la cantidad de notas a evaluar: ");
        int dato=lectura.nextInt();
        int notes;
        double [] vector1 =new double [dato];
        double total=0;
        for (int i = 0; i < dato; i++) {
            System.out.println("Ingrese las notas: ");
            vector1[i]=lectura.nextInt();
        }
        for (double d : vector1) {
            total=total+d;
        }
        
        total=total/dato;

        if (total<3) {
            System.out.println("Reprobaste"+total);
        }
        else if (total>=3 && total<=4.0) 
        {
          System.out.println("Pasaste Raspando"+total);  
        }
        else if (total>4.0) {
            System.out.println("Aprobaste con buenos resultados"+total);
            
        }

    }
}
