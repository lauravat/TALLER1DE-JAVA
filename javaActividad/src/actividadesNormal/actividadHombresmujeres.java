package actividadesNormal;

import java.util.Scanner;

public class actividadHombresmujeres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int acumMen=1;
        int acuWoman=1;
        for(int x=1; x<=10; x++){
            System.out.println("Si es hombre seleccione 1, si es mujer seleccione 2:");
        int gender=lectura.nextInt();
            switch (gender) {
                case 1:
                    acumMen=acumMen+1;
                    break;
                case 2:
                acuWoman=acuWoman+1;
                    break;
                
            }
            System.out.println("la cantidad de hombres es:"+acumMen);
            System.out.println("la cantidad de mujere es:"+acuWoman);
        }
        lectura.close();
    }
}
