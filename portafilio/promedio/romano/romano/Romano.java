package romano;
import java.util.Scanner;
public class Romano {
    public void romano(){
        // Definimos objeto Scanner
        Scanner entrada = new Scanner(System.in);
        // Definimos variable de salida
        String roma;
        // Definimos variable de entrada
        short ara;
        System.out.println("Proporciona número arábigo (1-10):");
        ara = entrada.nextShort();
        switch (ara) {
            case 1:
                roma ="I";
                break;
            case 2:
                roma = "II";
                break;
            case 3:
                roma = "III";
                break;
            case 4:
                roma = "IV";
                break;
            case 5:
                roma = "V";
                break;
            case 6:
                roma = "VI";
                break;
            case 7:
                roma = "VII";
                break;
            case 8:
                roma = "VIII";
                break;
            case 9:
                roma = "IX";
                break;
            case 10:
                roma = "X";
                break;
            default:
                roma ="Valor inválido";
                break;
        }
        System.out.println("Romano = "+roma);
    }
}
