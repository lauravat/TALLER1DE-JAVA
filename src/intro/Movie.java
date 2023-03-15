package intro;

import java.util.Scanner;

public class Movie {
    //atributos
    public String nuevaPelicula;
    private String name;
    private Double duration;
    String category;
    public String director;
    public String nuevaCategoria;


    Scanner lectura = new Scanner(System.in);
    
    public void addMovie(String nombre, String direc, String Categoria, Double duracion){
        name=nombre;
        director=direc;
        category=Categoria;
        duration=duracion;

    }
    public void changeMovie(){

        System.out.println("Digite la nueva categoria: ");
        nuevaCategoria=category;
        nuevaCategoria=lectura.nextLine();
    }
    public Double addCredits(){
        duration+=15;
        System.out.println("El nuevo tiempo de la pelicula es: "+duration);
        return duration;
    }
    //Metodo contructor
    public Movie(){
    }
    public Movie(String nombre, String direc, String Categoria, Double duracion){
        name=nombre;
        director=direc;
        category=Categoria;
        duration=duracion;

    }

    }
