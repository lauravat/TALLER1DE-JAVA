package actividadesNormal;

import java.util.Scanner;

public class actividadPresupuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int budget= 100000;
        System.out.println("Usted tienen un presupuesto total de: "+budget);
        int go=1;
        int spend;
while (go==1) {
    //instrucciones que desea repetir
    System.out.println("Ingrese el valor del gasto:");
    spend=lectura.nextInt();
    System.out.println("¿Desea registrar otro gasto?");
    go=lectura.nextInt();
    
}
    lectura.close();
}
