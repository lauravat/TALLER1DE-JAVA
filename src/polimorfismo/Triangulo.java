package polimorfismo;

public class Triangulo {
    private float Base;
    private float Altura;

    public float getBase() {
        return Base;
    }

    public void setBase(float Base) {
        this.Base = Base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public void CalcularArea() {
        float area = (Base * Altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
