package intro;

import java.util.Scanner;

public class Animal {
    //atributos
    public String name; //atributo publico
    private int age;//atributo privado

    private Scanner lectura = new Scanner(System.in);

    //Metodo constructor vacio 
    public Animal(){

    }
    //Metodo contructor 
    public Animal(String nombre, int edad){
        this.name=nombre;
        this.age=edad;
    }
    //metodos accesores / get y set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //metodos
    //void significa que no retorna, que es vacio
    public void registrarAnimal(String n, int e)
    {
        //cuerpo metodo
       name=n;
       age=e;

    }
    public void mostrarAnimal(){
        System.out.println("El nombre del animal es: "+name+ " y su edad es : " +this.age);
    }

    //metodos con retorno
    public int duplicarEdad(int e){
        int duplicar=e*2;
        return duplicar;
    }
}
