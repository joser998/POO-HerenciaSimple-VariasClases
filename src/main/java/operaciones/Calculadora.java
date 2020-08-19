package operaciones;
import java.util.Scanner;
public class Calculadora {
    Scanner sc = new Scanner(System.in);
    
    public Calculadora(){}
    
    protected int numero1 = 0, numero2 = 0;
    
    public void pedirDatos(){
        System.out.print("Numero: ");
        numero1 = sc.nextInt();
        System.out.print("Numero: ");
        numero2 = sc.nextInt();
    }
}
