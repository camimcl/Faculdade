public class Main {
    public static void main(String[] args) {
        class Solution {
            public boolean isPalindrome(int x) {
                if (x < 0){
                    //todo numero negativo nao eh um palindromo
                    return false;
                }
                int temp = x; //temp armazenara o valor original de x
                int rev = 0;// rev sera o numero reverso de x
                int dig = 0; // dig sera o resto da divisao de x por 10
                while (x > 0){//pois palindromos nao sao negativos
                    dig = x % 10; //resto da div
                    rev = (rev * 10) + dig;//reversao da divisao de dig
                    x = (int)(x / 10); // int eh pra retornar um valor inteiro
                }
                if(rev == temp){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
}