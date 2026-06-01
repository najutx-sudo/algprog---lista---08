public class Atividade5 {

    public static void main(String[] args) {
        double custoItem = 100.0;
        double taxa = 15.0; // 15% de imposto

        // Altera o valor aplicando o retorno da função à variável
        custoItem = somaImposto(taxa, custoItem);

        System.out.printf("O valor do custo com imposto incluído é: R$ %.2f%n", custoItem);
    }

    // Função que calcula e inclui o imposto no custo original
    public static double somaImposto(double taxaImposto, double custo) {
        double valorImposto = custo * (taxaImposto / 100);
        return custo + valorImposto;
    }
}

