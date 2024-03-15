package expresion;
import java.util.Scanner;
public class Expresion{

    public  void calcularExpresion(){
        Scanner teclado = new Scanner(System.in);
        float r;
        int a,b;
        System.out.println("Proporciona valor de a:");
        a = teclado.nextInt();
        System.out.println("Proporciona valor de b:");
        b = teclado.nextInt(); 
        r = (float)Math.pow((a+b),2)/(3*b);
        System.out.println("Resultado = "+r);
        teclado.close();
    }
    
}
