package salud;

import java.util.Scanner;


public class Persona {
    //atributos
    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public float peso;
    public double estatura;
    public int edad;
    public String sexo;

    //
    double pesoActual=0;

    private Scanner lectura = new Scanner(System.in);
    //metodos
    public void pedirDatos(){
        //cuerpo metodo
        System.out.println("Ingrese su tipo de documento: ");
        tipoDoc=lectura.nextLine();
        System.out.println("Ingrese su numero de documento: ");
        documento=lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre=lectura.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido=lectura.nextLine();
        System.out.println("Ingrese su peso: ");
        peso=lectura.nextFloat();
        System.out.println("Ingrese su estatura: ");
        estatura=lectura.nextFloat();
        System.out.println("Ingrese su edad: ");
        edad=lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su sexo: ");
        sexo=lectura.nextLine();
    }
    public void mostrarDatos(){
        //cuerpo metodo
        System.out.println("Su tipo de documento es: " +this.tipoDoc+ ", su numero de documento es: "+this.documento+ ", su nombre es: "+ this.nombre + ", su apellido es: "+apellido+ ", su peso es: "+peso+ "su estatura es: "+estatura+  ", su edad es: "+this.edad+ " y por ultimo su sexo es: "+this.sexo );
    }
    public double calcularIMC(){
        pesoActual=peso/(estatura*estatura);
        return pesoActual;
    }
    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad ");
            
        } else {
            System.out.println("Usted es menor de edad ");
        }
    }
    //Metodo constructor
    public Persona(){

    }
    public Persona(String tDocumento, int doc, String name, String lastName, float p, Double estat, int age, String sex){
        tipoDoc=tDocumento;
        documento=doc;
        nombre=name;
        apellido=lastName;
        peso=p;
        estatura=estat;
        edad=age;
        sexo=sex;
    }
}
