
import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        imprimirPadrao(n);
    }

    // Função que recebe n e imprime o padrão correspondente
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Quebra de linha após terminar a linha atual
        }
    }
}
    
