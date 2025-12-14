import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar: ");
        int n = sc.nextInt();

        double[] vetor = new double[n]; //criando meu vetor

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println("NUMEROS NEGATIVOS: " + vetor[i]);
            }

        }
    }
}
