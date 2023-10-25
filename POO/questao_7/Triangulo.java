/*3 - Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas:

Três lados formam um triângulo quando a soma de quaisquer dos dois lados é maior que o terceiro.
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
*/

package questao_3_triangulo;


import javax.swing.JOptionPane;

public class Triangulo {
    

    public static void main(String[] args) {
        Verificacao triangulo = new Verificacao();
        
        
        int x=1;
        
        while(x==1){
            
            int escolha =Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja fazer:\n1-Executar o programa\n2-Sair do programa"));
            
            switch(escolha){
                case(1) -> {
                    triangulo.lado1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado :"));
                   
                    triangulo.lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado :"));
                   
                    triangulo.lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado :"));
                    
                    JOptionPane.showMessageDialog(null,triangulo.tipotriangulo());
                }
                
                case(2) -> {
                   JOptionPane.showMessageDialog(null,"Você saiu do programa.");
                    x=2;
                }
                default ->{
                   JOptionPane.showMessageDialog(null, "Opção indisponível, tente novamente");
                }
        }
   
  }
}}
