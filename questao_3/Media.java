/*
3- Faça um programa para a leitura de duas notas parciais de um aluno.   

A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete; 
A mensagem “Aprovado com Distinção”, se a média for igual a dez; 
A mensagem “Reprovado” se a média for menor de do que sete; 
*/
package questao_3;

public class Media {

    public static void main(String[] args) {
        Notas not = new Notas();
        not.leitura();
        String result = not.avaliacao();
        System.out.println("Você está: "+result);
    }
}
