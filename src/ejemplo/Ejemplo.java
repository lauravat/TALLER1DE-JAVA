package ejemplo;

import intro.Movie;

public class Ejemplo {
    public static void main(String[] args) {
        Movie titanic= new Movie();
        titanic.director = "Erick";
    }
    //solo la clase movie puede acceder a name y duration ya que son atributos privados
}
