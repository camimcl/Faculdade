import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //exercise 1
        int smallestNumber = 0;
        int soma=0;
        int contador=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will u type?");
        int x=scan.nextInt();
        int[] vet = new int[x];
        for (int i=0;i<x;i++){
            System.out.println("type a number: ");
            vet[i] = scan.nextInt();
            if (i==0){
                smallestNumber=vet[i]; //o valor inicial sempre vai ser o smallestnumber
            }
            if (smallestNumber>vet[i]){ //comparar smallestnumber c cd numero que for dado
                smallestNumber=vet[i];
            }
            soma += vet[i];
        }

        double media=(double)soma /x;

        for (int i=0;i<x;i++){
            if(vet[i]>media){
                contador++;
            }
        }

        // vet [1, 1, 3, 4]
        // media = 1,666666667
        // contador = 1 (deveria)

        // numbersHigherThanMedia -> tamanho 1
        // vet -> tamanho 3 (iterar com o i)

        // numbersHigherThanMedia[0] = vet[i]
        // numbersHigherThanMedia[1] = vet[i]

        int[]numbersHigherThanMedia = new int[contador];
        int j=0;
        for (int i=0;i<x;i++){
            if (vet[i]>media){
                numbersHigherThanMedia[j]=vet[i];
                j++;
            }
        }

        //System.out.println(vet(x-1)); ultimo indice
        //System.out.println(Arrays.toString(vet)); melhor forma

        System.out.print("The numbers of the vetor are: [");
        for (int i=0; i<x;i++){
            System.out.print(vet[i]);
            if (i<(x-1)){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("smallest number: "+smallestNumber);
        System.out.println("media: "+media);
        System.out.println("numbers higher than media: "+contador);
        System.out.println("which numbers are higher than media: "+ Arrays.toString(numbersHigherThanMedia));
    }
}