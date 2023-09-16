/*2. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:

1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:

Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem. \Os pesos serão informados pelo desenvolvedor
*/
package media;

import javax.swing.JOptionPane;

public class Media_questao2 {

    public static void main(String[] args) {

        boolean exitProgram = false;
        Media menu = new Media();

        while (!exitProgram) {
            String media_tipo = JOptionPane.showInputDialog("1-Média Aritmética\n2-Média Ponderada\n3-Sair");
            switch (media_tipo) {

                case "1" ->
                    menu.media_a();

                case "2" ->
                    menu.media_p();

                case "3" -> {
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    exitProgram = true;
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
                }
            }
        }
    }
}
    }}
}}

