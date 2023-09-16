
package questao_3_triangulo;




public class Verificacao {
  
    double lado1, lado2, lado3;
    String tipo;
    public String tipotriangulo(){
        if (lado1+lado2>lado3 && lado1+lado3>lado2 && lado3+lado2>lado1){
            System.out.println("Os lados formam um triângulo.");
             if (lado1==lado2 && lado2==lado3){
            tipo=("Os lados informados formam um Triângulo Equilátero");
            }
            else if (lado1!=lado2 && lado1!=lado3 && lado3!=lado2){
            tipo ="Os lados informados formam um Triângulo Escaleno";
            }
            else if ((lado1==lado2 && lado1!=lado3) || (lado1==lado3 && lado1!=lado2) ||lado2==lado3 && lado3!=lado1){
            tipo="Os lados informados formam um Triângulo Isósceles";
            }
            }
        else{
        tipo="Os lados não podem formar um triângulo";
        
        }
      return tipo;
   }
    
    
    
    
}
