import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort { //quer saber qual o maior, dai jogap pra direita (compara um numero com um numero repetidamente)
    public void bubbleSort(int [] vet){
        int Interno,Externo;
        int temp=0;//variavel pra armazenar o maior valor temporario
        boolean swap=false;
        //for (Externo= vet.length-1;Externo>0;Externo--){
        for(Externo=0;Externo<vet.length;Externo++){//loop externo de tras pra frente podia ter feito normal tbm serve so pra dizer quantas vezes vai fazer
            swap = false;
            System.out.println("Loop externo:" +Externo);
            for (Interno=0;Interno<vet.length-1;Interno++){//loop interno ordem normal p comparar com o cara da frente (joga os numeros da esquerda pra direita)
                if(vet[Interno]>vet[Interno+1]){ //1 numero maior q o segundo
                    swap=true;
                    temp = vet[Interno]; //temp armazena o maior numero nessa parte do loop
                    vet[Interno]=vet[Interno+1];//o numero era o maior, agora recebe o valor do numero q ele foi comparado(menor)
                    vet[Interno+1]=temp;// o numero que antes era o menor, recebe o valor de temp(maior numero)
                }
                System.out.println("Loop Iterno:" +Interno);
            }
            if(!swap){ //condicao vira true mas swap continua falso
                break;
            }
        }
        System.out.println(Arrays.toString(vet));
    }
    public void selectionSort(int[]vet){ // quer saber ql o menor, dai joga pra esquerda(compara 1 numero com todos)
        int externoIndex,internoIndex,minIndex,temp;
        for(externoIndex=0;externoIndex<vet.length-1;externoIndex++){ //loop externoIndex (-1 pq quando ele executa o for externoIndex, o numero comparado anteriormente ja vai estar na posicao que ele precisava ficar, logo tem -1 posicao pra analisar)
            minIndex = externoIndex; //o menor valor temporario eh o primeiro analisado(POSICAO)
            for (internoIndex=externoIndex+1; internoIndex< vet.length;internoIndex++) { //o for internoIndex vai comparar o primeiro elemento analisado com todos os outros
                if (vet[internoIndex] < vet[minIndex]){// entao internoIndex eh menor que minIndex, logo
                    minIndex=internoIndex;// posicao menor valor agora eh o do internoIndex
                    //vet[in] sera o valor e o in sera a posicao
                }
            }
            temp = vet[externoIndex];//variavel temporaria armazena o valor do externoIndex
            vet[externoIndex]=vet[minIndex];//o externoIndex agora recebe o valor do vetor na posicao minIndex
            vet [minIndex]=temp;//posicao em minIndex recebe o valor de temp
        }//trocar o que tem dentro do copo a pelo que tem no copo b
        System.out.println(Arrays.toString(vet));
    }
    public int fatorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*(fatorial(n-1));
        }
    }
    double Potencia (double base, int exp){
        if(exp==1){
            return base;
        }
        return Potencia(base,exp-1)*base;
    }



}