package exercicio_1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // pense que isso eh o front
        System.out.println("Digite o valor do cateto A: ");
        double catetoA = scan.nextDouble();

        System.out.println("Digite o valor do cateto B: ");
        double catetoB = scan.nextDouble();

        scan.close();

        CalculadoraPitagoras calculadoraPitagoras = new CalculadoraPitagoras();

        System.out.println("O valor da Hipotenusa é : " +
                calculadoraPitagoras.calcularHipotenusa(catetoA, catetoB));
    }
}
