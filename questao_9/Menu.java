
package media;
import javax.swing.JOptionPane;
public class Menu {
    double media_a, media_p,nota1,nota2,nota3;
    double p1=3;
    double p2=3;
    double p3=4;
   
    public double media_a(){
       
       nota1 =Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota")); 
       nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
       media_a= (nota1+nota2)/2;
       JOptionPane.showMessageDialog(null, "A média aritmética das notas é :"+media_a);
     
        return media_a;
    }
    public double media_p(){
        nota1 =Double.parseDouble(JOptionPane.showInputDialog("Digite a Primeira nota")); 
       nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
       nota3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
       media_p=((nota1*p1)+(nota2*p2)+(nota3*p3))/(p1+p2+p3);
       JOptionPane.showMessageDialog(null, "A média ponderada das notas é :"+media_p);
    return media_p;
    }
}
