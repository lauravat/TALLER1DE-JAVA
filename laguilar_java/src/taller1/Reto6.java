package taller1;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Reto6 {
    public static void main(String[] args) throws Exception {
    Scanner ingreso = new Scanner(System.in);
     System.out.println("Digita tu usuario: ");
     String user=ingreso.nextLine();
     System.out.println("Digita tu contraseña:");
     String password=ingreso.nextLine();
     if (user=="Usuario" && password=="Contraseña")
     {
        System.out.println("Bienvenido al sistema");
     }
     else if(user=="Usuario" OR password=!"Contraseña")
     {
        System.out.println("Parece que olvitste tu contraseña");
     }
     else if(user=!"Usuario" OR password=="Contraseña")
     {
        
     }
    }
    ingreso.close();
}
