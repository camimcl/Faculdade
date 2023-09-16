/*1 - Faça um programa em java que receba o valor dos
catetos a e b de um triângulo, calcule e mostre o valor da hipotenusa. 

*/
package exercicio_1;

class CalculadoraPitagoras {

    public double calcularHipotenusa(double catetoA, double catetoB) {
         return Math.sqrt(catetoA * catetoA + catetoB * catetoB);
    }

    public double calcularCatetoAdjacente(double b, double hipotenusa){
        return Math.sqrt(hipotenusa - b);
    }

    public double calcularCatetoOposto(double a, double hipotenusa){
        return Math.sqrt(hipotenusa - a);
    }
}

