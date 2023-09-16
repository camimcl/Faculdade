/*2- Crie uma classe para representar uma conta-corrente, com métodos para
    depositar uma quantia, sacar uma quantia e obter o saldo. Para cada
    saque será debitada também uma taxa de operação equivalente à 0,5% do valor sacado. */

package exercicio_2;
import java.util.Scanner;

public class ContaC {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ContaCorrente conta = new ContaCorrente();
    int x=1;  
    
    
    while (x==1){
        System.out.println("Deseja realizar alguma ação? \n1-Sim. \n2-Não.");
        int menu =scan.nextInt();
        x=2;
        if(menu==2){
        System.out.println("Tudo bem, saindo...");
        x=2;
        }
        if (menu!=1 && menu!=2){
            System.out.println("Opção indisponível"); 
        x=1;  
              
        }  
        
        
        while(menu==1){
        System.out.println("Opções disponíveis:\n1-Depositar.\n2-Sacar.\n3-Sair.");       
        int acao=scan.nextInt();
        if (acao!=1 && acao!=2 && acao!=3){
            System.out.println("Opção indisponível!");
        }
        switch(acao){
            case(1):
                conta.depositar();
            break;  
            
            case(2):
                conta.sacar();
            break;
            case(3):
                System.out.println("Tudo bem, saindo...");
                menu=2;
           
            }
        }                     
    }}}

        
        
    
