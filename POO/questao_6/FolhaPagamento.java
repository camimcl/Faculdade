/*
2 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda, que depende 
do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
a. Desconto do IR;
b. Salário Bruto ate R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.

Imprima na tela as informações, dispostas conforme o exemplo abaixo, no exemplo 
valor da hora é 5 e a quantidade de horas é 220.  
Salário bruto (5 * 220)           : R$   1100,00
( – ) IR (5%)                     : R$     55,00
( – ) INSS ( 10% )                 : R$     110,00
FGTS ( 11%)                       : R$     121,00
Total de descontos                 : R$     165,00
Salário Líquido                   : R$     935,00 
*/
package questao_2;

public class FolhaPagamento {
    public static void main(String[] args) {
    Descontos user = new Descontos();
    int start=1;
    
      while (start == 1 ){
        System.out.println("Quanto custa a sua hora?");
        user.valor = user.v.nextDouble();
        System.out.println("Quantas horas foram trabalhadas esse mês ?");
        user.horas = user.h.nextDouble();
        
        user.calculo();
      
        System.out.println("Salário Bruto: R$"+user.salarioB);
        System.out.println("IR: R$"+user.IR);
        System.out.println("Sindicato: R$"+user.Sindicato);
        System.out.println("INSS: R$"+user.INSS);
        System.out.println("FGTS: R$"+user.FGTS);
        System.out.println("Total de descontos: R$"+user.descontos_total);
        System.out.println("Salário Liquido: R$"+user.salarioL);
        System.out.println("1-Encerrar programa.\n2-Calcular salário & descontos.");
        int encerrar = user.leave.nextInt();
        
        switch (encerrar) {
            case 1 -> start = 0 ;
            case 2 -> start= 1 ;
            default -> System.out.println("Opção inválida, tente novamente");
        }
        
          
      } 
}
}


