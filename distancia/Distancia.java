package distancia;
import java.util.Scanner;
public class Distancia{
    public  void calcularDistancia()
    {
        
        
        try (//definir objeto Scanner
        Scanner teclado = new Scanner(System.in)) {
            //Definir variable de salida
            float d;
            //Definir variable de entrada
            float v,t;

            System.out.print("Proporciona velocidad mts/seg:");
            v = teclado.nextFloat();

            System.out.print("Proporciona el tiempo seg:");
            t = teclado.nextFloat();

            d = v*t;

            System.out.println("Distancia = "+d+" mts");
        }

        //teclado.close();

    }

    @Override
    public String toString() {
        return "Distancia []";
    }
}
