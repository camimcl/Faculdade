
package exercicio_1;

import java.util.Scanner;

class Hipotenusa {
   
    double catetoA;
    double catetoB;
    
     public void catetos(){
     Scanner scan = new Scanner(System.in);
         System.out.println("Digite o valor do cateto A: ");
         catetoA = scan.nextDouble();
         System.out.println("Digite o valor do cateto B: ");
         catetoB = scan.nextDouble();
         scan.close();
            
     }
     public double calcHipotenusa(){
         return Math.sqrt(catetoA * catetoA + catetoB * catetoB);
    }
}

