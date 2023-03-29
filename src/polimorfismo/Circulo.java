package polimorfismo;

//de figura se hereda el metodo
public class Circulo extends Figura {

    private float Radio;

    public float getRadio() {
        return Radio;
    }

    public void setRadio(float Radio) {
        this.Radio = Radio;
    }

    public void IngresarDatos() {
        
    }

    public void CalcularArea() {
        double area = 3.1416 * (Radio * Radio);
        System.out.println("El area del circulo es: " + area);
    }
}
