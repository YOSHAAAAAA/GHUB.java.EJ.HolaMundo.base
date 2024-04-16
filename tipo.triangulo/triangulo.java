package tipoTriangulo;
import java.util.Scanner;

public class triangulo {
    public void triangulo(){
        Scanner entrada = new Scanner(System.in);
        String tipo;
        float l1,l2,l3;
        System.out.println("proporciona lado 1:");
        l1 = entrada.nextFloat();
        System.out.println("proporciona lado 2:");
        l2 = entrada.nextFloat();
        System.out.println("proporciona lado 3:");
        l3 = entrada.nextFloat();
        if (l1==l2 && l2==l3){
            tipo = "equilatero";
        }
        else{
            if (l1 != l2 && l2 != l3&& l3 != l1){
                tipo = "escanelo";
            }
        }
    }

    
}
