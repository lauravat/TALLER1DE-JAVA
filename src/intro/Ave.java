package intro;

public class Ave extends Animal{
    //Atributos
    private int envergadura;

    //constructor
    public Ave(){

    }
    public Ave(int envergadura){
        this.envergadura=envergadura;

    }
    public Ave (String nombre, int edad, int envergadura){
        super(nombre, edad);
        this.envergadura=envergadura;
        }

        // Metodo
        public void mostrarAve(){
            System.out.println("El nombre del animal es"+getName() + "tiene"+getEdad());
        }
}
