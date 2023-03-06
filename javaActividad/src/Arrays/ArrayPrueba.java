package Arrays;

import java.util.Scanner;

public class ArrayPrueba {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[] prueba={10,20,30,40,50};
        int [] prueba2={};

        /*for (int i: prueba){
    System.out.println(i);
         }*/
         for (int p=0;p<prueba2.length; p++){
            System.out.println("Ingrese un numero en la posicion: "+p);
            prueba2[p]=lectura.nextInt();
         }
        lectura.close();
    }

}
