package exercicios;
import java.util.Scanner;

class Numero {
    Scanner scan = new Scanner(System.in);
    float numero1;
    float numero2;
    float numero3;
    float x;
 
    public void leitura(){
        System.out.println("Digite um número: ");
        numero1 = scan.nextFloat();
        System.out.println("Digite um número: ");
        numero2 = scan.nextFloat();
        System.out.println("Digite um número: ");
        numero3 = scan.nextFloat();
        scan.close();

    }
    public float verificacao(){
        if (numero1>=numero2 && numero1>=numero3){
            x = numero1;
            
        }    
        else if(numero2>=numero1 && numero2>=numero3){
            x = numero2;
               
        }
        else if(numero3>=numero1 && numero3>=numero2){
           x = numero3;
        }
     return(x);        
       
}}

