
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese el numero :");
        numero = lector.nextInt();
        metodos met = new metodos(numero);
        System.out.println("\nEl Resultado de la suma de todos los numeros es: " +met.hacerMulti());
    }
}
