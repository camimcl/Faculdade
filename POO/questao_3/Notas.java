package questao_3;
import java.util.Scanner;

class Notas {
    
    Scanner scan = new Scanner(System.in);
    double nota1;
    double nota2;
    String resultado;

    public void leitura (){
       System.out.println("Digite sua nota :");
       nota1 = scan.nextFloat();
       System.out.println("Digite sua nota :");
       nota2 = scan.nextFloat();
       scan.close();
    } 
    public String avaliacao(){
        double media =(nota1 + nota2)/2;
        
        if (media==10){
          resultado = "Aprovado com distinção";
         }
        
        else if (media >= 7) {
        resultado="Aprovado" ;
       }
        
        else if(media<7){
        resultado = "Reprovado";
       }
    return resultado;
    }
    }
