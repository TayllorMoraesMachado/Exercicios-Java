public class CalculaProdutos {

    public static void main(String[] args) {


        // Código das peças

        int codigo1 = 12;
        int codigo2 = 16;

        // Quantidade de peças
        int qt1 = 1;
        int qt2 = 2;

        // Valor unitário de cada peça
        double peça1 = 5.30;
        double peça2 = 5.10;

        // Soma o valor total
        double valorTotal = (qt1 * peça1) + (qt2 * peça2);
        System.out.printf("VALOR TOTAL: R$ %.2f", valorTotal);
    }
}
