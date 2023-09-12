
package media;

import javax.swing.JOptionPane;


public class Media {
   
   
    public static void main(String[] args) {
      int loop = 1; 
      
      Menu x= new Menu();
    while (loop==1){
    String menu=JOptionPane.showInputDialog("1-Média Aritmética\n2-Média Ponderada\n3-Sair"); 
    switch (menu){
        
    case "1":
    x.media_a();
            break;
        
    case "2":
    x.media_p();
    break;
        
    case "3":
   JOptionPane.showMessageDialog(null, "Saindo do programa.");
    loop=2;
    break;

    default:
    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
    loop=1;
    }}
}}

