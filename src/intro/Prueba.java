package intro;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Animal panda= new Animal();
        Scanner lectura = new Scanner(System.in); //el sytem. in es un argumento
        
        System.out.println("Ingrese el nombre del animal: ");
        String name=lectura.nextLine();
        System.out.println("Ingrese la edad el animal: ");
        int age=lectura.nextInt();

        panda.registrarAnimal(name,age ); //invocar el objeto
        panda.mostrarAnimal();
        //metodo con retorno
        int res=panda.duplicarEdad(age);
        System.out.println("La edad duplicada del animal es: "+res);

        Movie avengers= new Movie();

        Animal tigre=new Animal( "Tony",5);
        tigre.mostrarAnimal();

        Movie avatar=new Movie( "Avatar el camino del agua", "Juan", "Infantil", 3.12);

        Movie minions=new Movie("Mi villano favorito", "Miguel", "Terror", 2.10);

        
    
    }


}
