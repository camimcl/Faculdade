/*1. Um posto está vendendo combustíveis com a seguinte tabela de descontos: 

Álcool:
Até 20 litros: desconto de 3% por litro
Acima de 20 litros: Desconto de 5% por litro.

Gasolina:
Até 20 litros: desconto de 4% por litro
Acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, 
o tipo de combustível (codificado da seguinte forma: A-álcool. G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente. O valor do combustível será dado pelo desenvolvedor
*/


package posto;
import javax.swing.JOptionPane;

public class Posto {
   

    public static void main(String[] args) {
        
      int loop = 1;  
      Descontos combustivel = new Descontos();
      while (loop==1){
      String menu = JOptionPane.showInputDialog("Escolha o combustível:\n1-G-Gasolina\n2-A-Álcool");
      switch (menu){
      
          case "1" ->combustivel.gasolina();
          case "2" ->combustivel.alcool();
          default-> JOptionPane.showMessageDialog(null,"Opção indisponível, tente novamente");
       }  
        
        
        
    }}
}
