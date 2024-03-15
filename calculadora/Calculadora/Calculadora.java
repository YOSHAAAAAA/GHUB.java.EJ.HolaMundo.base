package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public void Suma(){
        Scanner teclado = new Scanner(System.in);
       int r;
       int op1,op2;
       System.out.println("*********************");
       System.out.println("******   SUMA *******");
       System.out.println("*********************");
       System.out.print("\n");

       System.out.println("proporciona valor 1:");
       op1 = teclado.nextInt();
       System.out.println("proporciona valor 2:");
       op2 = teclado.nextInt();

       r = op1 + op2;
       System.out.println("Suma="+r);


    }
    public void resta(){
        Scanner teclado = new Scanner(System.in);
        int r;
       int op1,op2;
       System.out.println("***********************");
       System.out.println("******* RESTA *********");
       System.out.println("***********************");
       System.out.print("\n");

       System.out.println("proporciona valor 1:");
       op1 = teclado.nextInt();
       System.out.println("proporciona valor 2:");
       op2 = teclado.nextInt();

       r = op1-op2;
       System.out.println("Resta="+r);

    }
    public void mult(){
        Scanner teclado = new Scanner(System.in);
        int r;
       int op1,op2;
       System.out.println("*******************************");
       System.out.println("****** MULTIPLICACION**********");
       System.out.println("*******************************");
       System.out.print("\n");

       System.out.println("proporciona valor 1:");
       op1 = teclado.nextInt();
       System.out.println("proporciona valor 2:");
       op2 = teclado.nextInt();

       r = op1 * op2;
       System.out.println("Multiplicacion="+r);

    }
    public void div(){
        Scanner teclado = new Scanner(System.in);
        int r;
       int op1,op2;
       System.out.println("**************************");
       System.out.println("******** DIVISION ********");
       System.out.println("**************************");
       System.out.print("\n");

       System.out.println("proporciona valor 1:");
       op1 = teclado.nextInt();
       System.out.println("proporciona valor 2:");
       op2 = teclado.nextInt();
       r = op1/op2;
       System.out.println("conciente="+r);


    }
    public void res(){
        Scanner teclado = new Scanner(System.in);
        int r;
       int op1,op2;
       System.out.println("**************************");
       System.out.println("******** RESIDUO *********");
       System.out.println("**************************");
       System.out.print("\n");

       System.out.println("proporciona valor 1:");
       op1 = teclado.nextInt();
       System.out.println("proporciona valor 2:");
       op2 = teclado.nextInt();

       r = op1 % op2;

       System.out.println("Resido="+r);

    }
}
