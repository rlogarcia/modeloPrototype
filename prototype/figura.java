public interface figura {
    // Método para cambiar nombre
    void setNombre(String n);
    
    // Método para obtener el nombre
    String getNombre();
    
    // Método para mover la figura
    void mover(int x, int y);
    
    // Método para obtener la posición 
    void getPosicion();
    
    // Método para clonar figura
    figura clonar();
}
