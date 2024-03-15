package triangulo;
import java.util.Scanner;
public class triangulo {
    private Object math;

    public  void calcularPerimetroSuperficie(Object object){
        Scanner entrada = new Scanner(System.in);
        double per,sup;
         double base;
        double altura;
         double hip;


         System.out.print("proporciona base:");
         base = entrada.nextFloat();
         System.out.print("proporciona altura:");
         altura = entrada.nextFloat();


         sup = (base * altura)/2;

        hip = math.sqrt (math.pow(base)+ math.pow(altura));

        per= base + altura +hip;

        System.out.print("superficie = "+sup);
        System.out.print("perimetro = "+per);
        
        entrada.close();


    }
    
}
