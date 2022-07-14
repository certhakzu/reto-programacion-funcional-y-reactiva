package derivadaintegral;

import java.util.List;
import java.util.Scanner;

public class PruebaDerivadaIntegral {
    public static void main(String[] args) { //2x^2 + 3x + 5

        Scanner scanner = new Scanner(System.in);

        Polinomio polinomio = new Polinomio(List.of(new Monomio(2.0, "X", 2),
                            new Monomio(3.0, "X", 1)),
                    5.0);

        Calculo calculo = new Calculo(polinomio);

        String op;
        System.out.println(">>> FUNCION F(X) = " + polinomio);
        System.out.println("\n1 - Derivar\n2 - Integrar\n3 - Salir\n\n Digite Opcion::: ");
        op = scanner.nextLine();
        switch (op){
            case "1":
                System.out.println(">>> F'(X) = " + calculo.calcularDerivada());
                break;
            case "2":
                System.out.println(">>> Integral de F(X) = " + calculo.calcularIntegral());
                break;
            case "3":
                System.out.println("HASTA PRONTO!");
                break;
            default:
                System.out.println("OPCION NO VALIDA XD");
            }
    }
}
