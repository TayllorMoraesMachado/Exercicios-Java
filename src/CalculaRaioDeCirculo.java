public class CalculaRaioDeCirculo {

    public static void main(String[] args) {

        // Fórumula da área = pi .raio*2
        double valorDoRaio = 2.0;
        double pi = 3.14159;

        double valorTotal = pi * (valorDoRaio * valorDoRaio);
        System.out.printf("A= %.4f", valorTotal);
    }
}
