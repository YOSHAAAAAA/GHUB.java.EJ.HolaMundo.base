package promedio2;
import static org.junit.jupiter.api.Assertions.assertAll;


import java.util.Scanner;

public class Promedio {
    public void promedio(){
        //objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //variable de salida
        float r;

        //variable de entrada
        int n,total_calf;

        //variables auxiliares
        int acum_calf=0,cuenta=1;
        System.out.print("Proporciona cantidad de calificaciones a capturar:");
        total_calf = teclado.nextInt();
        while (cuenta<=total_calf){
            System.out.print("Proporciona parcial "+cuenta+":");
            n = teclado.nextInt();
            acum_calf += n;
            cuenta++;
        }
        r = acum_calf/total_calf;
        System.out.println("Promedio = "+r);
    }
    
}