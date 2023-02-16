import java.util.Random;
import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) throws Exception{
        Scanner play1 = new Scanner(System.in);
        Random play2 = new Random();
        System.out.println("Inserte 1 si elige tijeras. 2 para papel, 3 para piedra");
        int option1=play1.nextInt();
        int option2=1+ play2.nextInt(3);
        System.out.println(option2);
        if (option1==1 && option2==1)  {
            System.out.println("Empate");
        }
        else if (option1==2 && option2==2)  {
            System.out.println("Empate");
        }

        else if (option1==3 && option2==3)  {
            System.out.println("Empate");
        }
        else if (option1==1 && option2==2) //casos donde gana el usuario
        {
            System.out.println("¡Gano!");
        }
        else if (option1==2 && option2==3) 
        {
            System.out.println("¡Gano!");
        }
        else if (option1==3 && option2==1) 
        {
            System.out.println("¡Gano!");
        }
        else if (option1==2 && option2==1 ) 
        {
            System.out.println("Pierdes :c ");
        }
        else if (option1==3 && option2==2 ) 
        {
            System.out.println("Pierdes :c ");
        }
        else if (option1==1 && option2==3 ) 
        {
            System.out.println("Pierdes :c ");
        }
        else{
            System.out.println("No cumple ninguna condición, por lo tanto no es valido, digite un nuevo valor nuevamente entre 1-3");
        }
    }
}
