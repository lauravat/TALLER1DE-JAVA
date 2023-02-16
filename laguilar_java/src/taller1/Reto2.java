package taller1;

import java.util.Scanner;


public class Reto2 {
    public static void main(String[] args) throws Exception{
        Scanner lectura =new Scanner(System.in);
        System.out.println("Digite los meses que tiene el paciente: ");
        int age=lectura.nextInt();
        if (age<12) {
            System.out.println("Es apto para la vacuna, por favor digite el peso: ");
            float weight=lectura.nextFloat();
            //double dose=(weight+10)/(age*10)*8;
            System.out.println("La dosis de vacuna que se debe aplicar al bebe es de:"+((weight+10)/(age*10)*8));            
        } else {
            System.out.println("No es apto para la vacuna");
        }

        lectura.close();
        
    }
    
}
