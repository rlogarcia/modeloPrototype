// se crea una clase circulo de tipo figura 
public class cuadrado implements figura{    
    // se crea un parametro nombre para identificar el objeto
    private String nombre;
    // se creea un parametro de tipo entero para las posiciones 
    private int posicionX,  posicionY;
    // se crea el constructor vacio
    public cuadrado(){}
    // metodo cambiar nombre del objeto 
    public void setNombre(String n){
        this.nombre = n;
    }
    //metodo que me devuelve nombre del  objeto
    public String getNombre(){
        // retorna el atributo nombre 
        return nombre;
    }
    // metodo para enviar posiciones nuevas del objeto
    public void mover(int x, int y){
        // asigna nuevas posiciones 
        this.posicionX=x;
        this.posicionY=y;

    }
    // metodo para optiener posiciones 
    public void getPosicion(){
        System.out.println("Cuadrado en x: " + this.posicionX);
        System.out.println("Cuadrado en y: " + this.posicionY);
    }
    // metodo encargado de crear copia exacta del circulo 
    public figura clonar(){
        // se crea un objeto nuevo de tipo figura
        figura figura = new cuadrado();
        // se le envia el parametro del nuevo nombre
        figura.setNombre(this.nombre);
        // se le envia las nuevas posiciones para el nuevo objeto 
        figura.mover(this.posicionX, this.posicionY);
        // el metodo devuelve una figura de tipo Figura
        return figura;
    }
    


}
