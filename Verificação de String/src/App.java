import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner palavraDigitada = new Scanner(System.in);
        String palavra;
        char letra = 'a';
        int encontrou;
        int quant = 0;

        System.out.println("Digite uma palavra, para verificar se é encontrada a letra (a)");
        palavra = palavraDigitada.nextLine();

        encontrou = palavra.toLowerCase().indexOf(letra);

        if (encontrou != -1) {

            for(int i=0; i<palavra.length(); i++){
                if (palavra.toLowerCase().charAt(i) == letra) {
                    quant+=1;
                }
            }
            System.out.println("A letra (a) aparece no texto " + quant + " vezes");

        } else{
            System.out.println("A letra (a) não aparece no texto");
        }
    }
}
