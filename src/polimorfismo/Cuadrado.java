package polimorfismo;

import java.util.Scanner;

//extends para traer un metodo de otra clase 
public class Cuadrado extends Figura{
    Scanner lectura = new Scanner(System.in);
    
    private float Lado;

    public float getLado(){
        return Lado;
    }

    public void setLado(float Lado){
        this.Lado=Lado;
    }

    public void IngresarDatos(){

    }
    @Override // 
    public void CalcularArea() {
        float area=Lado*Lado;
        System.out.println("El area del cuadrado es: "+area);
    }
}
