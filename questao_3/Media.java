
package questao_3;

public class Media {

    public static void main(String[] args) {
        Notas not = new Notas();
        not.leitura();
        String result = not.avaliacao();
        System.out.println("Você está: "+result);
    }
}
