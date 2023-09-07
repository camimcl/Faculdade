
package exercicio_1;


public class Main {

    public static void main(String[] args) {
        Hipotenusa hipotenusa = new Hipotenusa();
        hipotenusa.catetos();
        double calculo = hipotenusa.calcHipotenusa();
        System.out.println("O valor da Hipotenusa é : "+calculo);
        
        
    }
}
