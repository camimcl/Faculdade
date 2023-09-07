
package questao_1;

import java.util.Scanner;


public class ReajusteSalarial {
    double percentual,reajustado,valoraumento;
    
   
    Scanner info = new Scanner(System.in);   
    public double reajuste(){  
        
        double salario = info.nextDouble();
        
        if (salario<=280){
            valoraumento=(salario*20/100);
            reajustado+=salario+(salario*20/100);
            percentual = 20;
            
        } 
        else if (salario>280 && salario<=700){
            valoraumento=(salario*15/100);
            reajustado+=salario+(salario*15/100);
            percentual = 15;
            
        }
        else if (salario>700 && salario<=1500){
            valoraumento=(salario*10/100);  
            reajustado+=salario+(salario*10/100);
            percentual = 10;
            
        }
        else if (salario>1500){
            valoraumento=(salario*5/100); 
            reajustado+=salario+(salario*5/100);
            percentual = 5;
             
        }
      
    return reajustado;
    }
} 
    

