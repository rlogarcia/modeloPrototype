import java.util.Scanner;   

public class pruebaFiguras {
    public static void main(String ... args) {
        Scanner sc = new Scanner(System.in);
        int opcion,posX,posY;
        circulo circulo = new circulo();
        cuadrado cuadrado = new cuadrado();
        figura figura; 
        circulo.setNombre("Mi circulo");
        circulo.mover(12, 34);
        cuadrado.setNombre("Mi cuadrado");
        cuadrado.mover(200, 200);
        System.out.println("-----------Estas son las figuras originales------");
        System.out.println("Circulo: " + circulo.getNombre());
        System.out.println("Cuadrado: " + cuadrado.getNombre());
        System.out.println("-----------Estas son las Posiciones originales------");
        circulo.getPosicion();
        cuadrado.getPosicion();


        System.out.println("Digite la opcion que desea clonar: ");
        System.out.println("1 = Circulo, 2 = cuadrado");
        opcion =sc.nextInt();

        if(opcion == 1) {
            figura =circulo.clonar();
        }else{
            figura =cuadrado.clonar();
        }
        figura.setNombre(figura.getNombre()+ " Clonado");
        System.out.println("Digite la nueva posicion en x: ");
        posX = sc.nextInt();
        System.out.println("Digite la nueva posicion en y: ");
        posY = sc.nextInt();
        figura.mover(posX, posY);
        System.out.println("----------Esta es la figura clonada: -----------------------");
        System.out.println(figura.getNombre());
        System.out.println("Esta es la posicion del clon es: ");
        figura.getPosicion();
        System.out.println("-----------Estas son las figuras originales------");
        System.out.println("Circulo: " + circulo.getNombre());
        System.out.println("Cuadrado: " + cuadrado.getNombre());
        System.out.println("-----------Estas son las Posiciones originales------");
        circulo.getPosicion();
        cuadrado.getPosicion();
    }
}
