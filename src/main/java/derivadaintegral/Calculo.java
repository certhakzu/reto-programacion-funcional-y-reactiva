package derivadaintegral;

import java.util.Objects;
import java.util.stream.Collectors;

public class Calculo {

    private Polinomio polinomio;

    public Calculo(Polinomio polinomio){
        this.polinomio = polinomio;
    }

    public Polinomio calcularDerivada(){
        var derivada = polinomio.getExpresion().stream()
                .map(monomio -> {
                    monomio.setCoeficiente(monomio.getCoeficiente() * monomio.getGrado());
                    if (monomio.getGrado() - 1 == 0){ // Eje: 3x
                        polinomio.setConstante(monomio.getCoeficiente());
                        monomio.setGrado(monomio.getGrado() - 1);
                        monomio = null;
                    } else {
                        monomio.setGrado(monomio.getGrado() - 1);
                    }
                    return monomio;
                }).collect(Collectors.toList());
        var derivadaLimpia = derivada.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return new Polinomio(derivadaLimpia, polinomio.getConstante());
    }

    public Polinomio calcularIntegral(){
        String literal = polinomio.getExpresion().get(0).getLiteral();
        var integral = polinomio.getExpresion().stream()
                .map(monomio -> {
                    monomio.setCoeficiente(monomio.getCoeficiente() / (monomio.getGrado() + 1)); // a/(e+1)
                    monomio.setGrado(monomio.getGrado() + 1);

                    return monomio;
                }).collect(Collectors.toList());
        integral.add(new Monomio(polinomio.getConstante(), literal, 1));

        return new Polinomio(integral, 0.0);
    }
}
