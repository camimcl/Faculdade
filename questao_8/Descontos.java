
package posto;
import javax.swing.JOptionPane;
public class Descontos {
    double gaso, alco,litro,valor,desconto;
    
   public double gasolina (){ //4% && 6%
  
   
   litro=Double.parseDouble(JOptionPane.showInputDialog("Quantos litros deseja colocar?"));    
    if (litro<=20) {
    gaso= 5.5;
    valor = (litro*gaso);
    desconto=(valor*0.04);
    valor-=desconto;
    
    }
    else if (litro>20){
    gaso= 5.5;
    valor = (litro*gaso);
    desconto=(litro*gaso*0.06);
    valor-=desconto;
    }
    
   JOptionPane.showMessageDialog(null,"Valor a ser pago: R$"+valor);
   return valor;
   }
   
   public double alcool (){ //3% && 5% 
       litro=Double.parseDouble(JOptionPane.showInputDialog("Quantos litros deseja colocar?"));    
    if (litro<=20) {
    alco= 3.0;
    valor = (litro*alco);
    desconto=(valor*0.03);
    valor-=desconto;
    
    }
    else if (litro>20){
    alco= 3.0;
    valor = (litro*alco);
    desconto=(litro*alco*0.05);
    valor-=desconto;
    }   
       
   JOptionPane.showMessageDialog(null,"Valor a ser pago: R$"+valor);
   return alco;
   } 
}
