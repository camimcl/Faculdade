/*1 - Faça um programa em java que receba o valor dos
catetos a e b de um triângulo, calcule e mostre o valor da hipotenusa. 

*/
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

