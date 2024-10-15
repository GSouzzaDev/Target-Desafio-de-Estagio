import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int num;
        int proxFibonacci;
        Scanner numDigitado = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(0);
        fibonacci.add(1);

        System.out.println("Digite um numero para procurar na sequencia de Fibonacci");
        num = numDigitado.nextInt();

        while(true){
            proxFibonacci = fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2);
            fibonacci.add(proxFibonacci);
            if (proxFibonacci>num) {
                break;
            }
            
        }

        if (fibonacci.contains(num)) {
            System.out.println("O numero digitado: " + num + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println("O numero digitado: " + num + " nao pertence a sequencia de Fibonacci");
        }

        numDigitado.close();
    }
}
