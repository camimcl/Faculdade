
package questao_2;

import java.util.Scanner;

public class Descontos{
    double FGTS,INSS,Sindicato,IR,descontos_total,salarioB,salarioL,valor,horas;
    Scanner h = new Scanner(System.in);
    Scanner v = new Scanner(System.in);
    Scanner leave = new Scanner(System.in);

    public double calculo(){
     salarioB=(valor*horas);
     INSS=(salarioB*10/100);
     FGTS=(salarioB*11/100); 
     Sindicato=(salarioB*3/100);
     
     if (salarioB<=900){
        IR=(salarioB*0);
        descontos_total=(INSS+IR);
        salarioL=(salarioB-descontos_total);
     }   
    
     else if (salarioB>900 && salarioB<=1500){
        IR=(salarioB*5/100);    
        descontos_total=(INSS+IR);
        salarioL=(salarioB-descontos_total);
     }
     
     else if (salarioB>1500 && salarioB<=2500){
        IR=(salarioB*10/100); 
        descontos_total=(INSS+IR);
        salarioL=(salarioB-descontos_total);
     }
     
     else if (salarioB>2500){
        IR=(salarioB*20/100);
        descontos_total=(INSS+IR);
        salarioL=(salarioB-descontos_total);       
     }
  return salarioB;   
}   
}