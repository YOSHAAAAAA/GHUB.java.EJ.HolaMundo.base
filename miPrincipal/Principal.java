package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        calcularDistancia();
        
    }
    public static void calcularDistancia(){
        Scanner teclado = new Scanner(System.in);
        float d;
        float v,t;
        System.out.print("proporciona velocidad mts/seg:");
        v = teclado.nextFloat();

        System.out.print("proporciona el tiempo seg:");
        t = teclado.nextFloat();

        d = v*t;

        System.out.print("distancia = " +d+ "mts");
        teclado.close();
    }
    public static void calcularExpresion(){
        Scanner teclado = new Scanner(System.in);
         float r;
         int a,b;
         System.out.println("proporciona valor de a:");
         a = teclado.nextInt();
         System.out.println("proporciona valor de b:");
         b = teclado.nextInt();
         r = (a+b)^2/(3*b);
        // r = math.pow(a+b),2/(3*b);
         System.out.println("resultado = "+r);
         teclado.close();
    }
}