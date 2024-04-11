package mayor;
import java.util.Scanner;
public class Mayor {
    public void mayor(){
        //declarar eo objeto scanner;
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        System.out.println("proporciona los valores de a,b y c:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c= entrada.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("el mayor es:"+a);
            }
            else{
                System.out.println("el mayor es:"+c);
            }
        }else{
            if(b>c){
                System.out.println("el mayor es:"+b);

            }
            else{
                System.out.println("el mayor es:" +c);
            }
        }

    }
}
