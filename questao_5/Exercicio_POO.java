/*1 - As organizações CSM resolveram dar um aumento de salário aos seus colaboradores e 
lhe contrataram para desenvolver o programa que calculará os reajustes.  
a. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte 
critério, baseado no salário atual;

b. Salários até R$ 280,00 (incluindo): aumento de 20%;
c. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
d. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
e. Salários de R$ 1500,00 em diante: aumento de 5%;
Após o aumento ser realizado; informe na tela;

a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento. 
*/

package questao_1;


public class Exercicio_POO {

    public static void main(String[] args) {
      ReajusteSalarial user = new ReajusteSalarial(); 
      
      System.out.println("Digite seu salário para o ajuste: R$"+user.info);
      user.reajuste();
      System.out.println("Seu salário sem ajuste é : R$"+(user.reajustado-user.valoraumento));
      System.out.println("O percentual do aumento aplicado foi equivalente a: "+user.percentual+"%");
      System.out.println("O valor do aumento é de: R$"+user.valoraumento);
      System.out.println("Seu novo salário é: R$"+user.reajustado);
      
      
      
  
    }
}
