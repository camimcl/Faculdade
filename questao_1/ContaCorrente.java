
package exercicio_2;
import java.util.Scanner;
class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    
    double deposito;
    double saque;
    double saldo = 0;
    public double depositar(){
        System.out.println("Quanto deseja depositar?");
        deposito=scan.nextFloat();
        saldo = deposito+saldo;
        System.out.println("Você depositou "+deposito+"\nSeu saldo é de :"+saldo);
     return saldo;
      }
    public double sacar (){
        
        System.out.println("Quanto deseja sacar?");
        saque =scan.nextFloat();
        saque = (saque-(saque*0.005));
        saldo =(saldo-saque);
        System.out.println("Você sacou "+saque+"\nSeu saldo atual é de: "+saldo);
    return saldo;
    }
  
}

