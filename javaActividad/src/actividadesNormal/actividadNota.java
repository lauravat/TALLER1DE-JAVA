package actividadesNormal;

import java.util.Scanner;

public class actividadNota {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        double acum=0;
        double note=0;
        double average=0;

        for(double x=0; x<=3; x++){
            System.out.println("Digite la nota que obtuvo en cada uno de los talleres de manera individual:");
        note=lectura.nextDouble();
        average=average+note;
        }
        acum=average/4;
        System.out.println("Su nota final promediando las notas que usted digito es: "+acum);
        if (acum>=00 && acum<=2.9) 
        {
            System.out.println("Reprobaste la asignatura :c");
        } 
        else if (acum>=3.0 && acum<=4.0){
            System.out.println("Pasaste raspando la asignatura :|");
        }
        else if (acum>4.0){
            System.out.println("Aprobaste con buenos resultados :)");
        }
        else{
            System.out.println("por favor vuelva a digitar");
        }
        lectura.close();
    }
}
