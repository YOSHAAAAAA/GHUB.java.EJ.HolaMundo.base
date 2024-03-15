package miPrincipal;
import distancia.Distancia;
import expresion.Expresion;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Principal {
    
    public static void main(String[] args) {
         Distancia objDistancia = new Distancia();
        objDistancia.calcularDistancia();
        Expresion objExpresion = new Expresion();
        objExpresion.calcularExpresion(); 
    }
    
}