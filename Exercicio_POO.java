

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
