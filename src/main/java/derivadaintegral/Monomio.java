package derivadaintegral;

public class Monomio {
    private Double coeficiente;
    private String literal;
    private Integer grado;

    public Monomio(Double coeficiente, String literal, Integer grado) {
        this.coeficiente = coeficiente;
        this.literal = literal;
        this.grado = grado;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return coeficiente + literal + "^" + grado;
    }
}
