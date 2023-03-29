package polimorfismo;

public class Rectangulo {
    private float Base;
    private float Altura;
    
    public float getBase(){
        return Base;
    }
    public void setBase(float Base){
        this.Base=Base;
    }

    public float getAltura(){
        return Altura;
    }
    public void setAltura(float Altura){
        this.Altura=Altura;
    }

    public void CalcularArea(){
        float area=Base*Altura;
        System.out.println("El area del rectuangulo es de: "+area);
    }
}
