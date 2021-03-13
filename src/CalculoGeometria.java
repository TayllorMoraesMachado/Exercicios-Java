import java.util.Locale;

public class CalculoGeometria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double A = 3.0;
        double B = 4.0;
        double C = 5.2;
        double pi = 3.14159;

        double calculoTriangulo = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f%n", calculoTriangulo);

        double calculoCirculo = (C * C) * pi;
        System.out.printf("CIRCULO: %.3f%n", calculoCirculo);

        double calculoTrapezio = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO: %.3f%n", calculoTrapezio);

        double calculoQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f%n", calculoQuadrado);

        double calculoRetangulo = A * B;
        System.out.printf("RETÂNGULO: %.3f", calculoRetangulo);
    }
}
