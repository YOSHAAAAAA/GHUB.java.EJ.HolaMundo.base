package DIFedad;
//proposito: Determinar nombre de herman@ mayor
//autor:angel allembyjerath calderon sandoval
//fecha:9/04/24
import java.util.Scanner;

public class DIFedad {
    public void diferenciaEdades(){
        //definir objeto scanner;
        Scanner teclado = new Scanner(System.in);
        //definir la salida;
        String nombreHermanoMayor;
        byte DIFedad;
        //datos entrada
        String nombre1, nombre2;
        byte edad1, edad2;
        System.out.println("proporciona de hermano 1:");
        nombre1 = teclado.next();
        System.out.println("proporciona de hermano 1:");
        edad1 = teclado.nextByte();
        System.out.println("proporciona de hermano 2:");
        nombre2 = teclado.next();
        System.out.println("proporciona de hermano 2:");
        edad2 = teclado.nextByte();
        if (edad1>edad2){
            DIFedad = (byte)(edad1 - edad2);
            nombreHermanoMayor = nombre1;

        }else{
            DIFedad = (byte)(edad2 - edad1);
            nombreHermanoMayor = nombre2;
        }
        System.out.println("nombre del hermano mayor es:"+nombreHermanoMayor);
        System.out.println("diferencia de edad es:"+ DIFedad);



    }
    
}
