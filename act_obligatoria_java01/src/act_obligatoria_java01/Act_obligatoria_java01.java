
package act_obligatoria_java01;
import java.util.Scanner;
        
        
public class Act_obligatoria_java01 {


    public static void main(String[] args) 
    {
       String[] dato=new String[6];
        Scanner nombre=new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        dato[0]=nombre.nextLine();
                  
        Scanner apellido=new Scanner(System.in);
        System.out.println("Ingrese su apellido : ");
        dato[1]=apellido.nextLine();
        
        Scanner edad=new Scanner(System.in);
        System.out.println("Ingrese su edad : ");
        dato[2]=edad.nextLine();
        
        Scanner pasatiempo=new Scanner(System.in);
        System.out.println("Ingrese su pasatiempo favorito : ");
        dato[3]=pasatiempo.nextLine();
        
        Scanner ide=new Scanner(System.in);
        System.out.println("Ingrese su IDE preferida : ");
        dato[4]=ide.nextLine();
        
        Scanner sist_Op=new Scanner(System.in);
        System.out.println("Ingrese su sistema operativo : ");
        dato[5]=sist_Op.nextLine();

        System.out.println("Su nombre es "+dato[0]+", su apellido es "+dato[1]+", su edad es "+dato[2]+", su pasatiempo favorito es "+dato[3]+", su IDE preferido es "+dato[4]+" y su sistema operativo es "+dato[5]);
       
    }
    
}
