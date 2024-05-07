package incentivo;

import java.util.Scanner;

public class Incentivo {
    public void incentivo(){
        //crear objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //defino variable de salida
        boolean tiene_incentivo;
        //definir variable de entrada
        short unidades;
        System.out.print("Proporcione unidades semanales producidas:");
        unidades  = teclado.nextShort();
        if (unidades>100){
            tiene_incentivo = true;
            tiene_incentivo = true;
        }
        else
            tiene_incentivo = false;
        
        System.out.println("Tiene incentivo "+tiene_incentivo);
        teclado.close();

    }
    
}
