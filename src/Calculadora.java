public class Calculadora {

    public static void main(String[] args) {

        double numero1 = 30.0;
        double numero2 = 10.0;

        double subtracao = numero1 - numero2;
        System.out.println("SUBTRAÇÃO: " + subtracao);

        double adicao = numero1 + numero2;
        System.out.println("ADIÇÃO: " + adicao);

        double divisao = numero1 / numero2;
        System.out.println("DIVISÃO: " + divisao);

        double multiplicacao = numero1 * numero2;
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);

        double restante = numero1 % numero2;
        System.out.println("RESTANTE: " + restante);
    }
}
