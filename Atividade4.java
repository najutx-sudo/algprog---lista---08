public class Atividade4 {
    public static void main(String[] args) {
        // Exemplos de teste
        System.out.println("Para 5: " + verificarSinal(5));
        System.out.println("Para -3: " + verificarSinal(-3));
        System.out.println("Para 0: " + verificarSinal(0));
    }

    // Função que retorna 'P' para positivo e 'N' para zero ou negativo
    public static char verificarSinal(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}

