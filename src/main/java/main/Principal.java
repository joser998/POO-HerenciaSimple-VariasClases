package main;
import operaciones.division;
public class Principal {
    public static void main(String[] args) {
        System.out.println("Bievenido a Calculadora");
        
        division ob = new division();
        ob.pedirDatos();
        ob.suma();
        ob.resta();
        ob.multiplicacion();
        ob.division();
        
        System.out.println("Fin del Programa...");
    }
}
