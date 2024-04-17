import java.util.Scanner;
package vocal;

public class Vocal {
    public  void vocal(){
        Scanner entrada = new Scanner(System.in);
        String voc;
        System.out.println("Introduce una vocal:");
        voc = entrada.next().charAt(0);
        switch (voc) {
            case "a":
                System.out.println("1");
                break;
            case "e":
            System.out.println("2");
            case "i":
                System.out.println("3");
                break;
            case "o":
            System.out.println("4");
            case "u":
            System.out.println("5");
        
            default:
            System.out.println("caracter invalido");
                break;
        }
    }

    
    
}
