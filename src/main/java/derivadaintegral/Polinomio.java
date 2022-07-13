package derivadaintegral;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Polinomio {
    private List<Monomio> expresion;
    private Double constante;


    public Polinomio(List<Monomio> expresion, Double constante) {
        this.expresion = expresion;
        this.constante = constante;
    }

    public List<Monomio> getExpresion() {
        return expresion;
    }

    public Double getConstante() {
        return constante;
    }

    public void setExpresion(List<Monomio> expresion) {
        this.expresion = expresion;
    }

    public void setConstante(Double constante) {
        this.constante = constante;
    }


    @Override
    public String toString() {
        return expresion.stream()
                .map(Monomio::toString)
                .reduce((monomio, monomio2) -> monomio + " + " + monomio2) + " + "+ constante;
    }
}
