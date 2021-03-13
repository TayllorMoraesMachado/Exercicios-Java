import java.util.Locale;

public class CalculoSalario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int matriculaDoFuncionario = 33066;
        int quantidadeDeHorasTrabalhadas = 100;
        double valorDaHora = 5.50;

        double calculoTotalDoSalario = quantidadeDeHorasTrabalhadas * valorDaHora;

        System.out.println("MATRÍCULA: " + matriculaDoFuncionario);
        System.out.println("HORAS TRABALHADAS NO MÊS: " + quantidadeDeHorasTrabalhadas + "HORAS");
        System.out.printf("SALÁRIO: RS%.3f", calculoTotalDoSalario);
    }
}
