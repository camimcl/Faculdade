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


