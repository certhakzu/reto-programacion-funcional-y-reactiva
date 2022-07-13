package email;

public class Email {

    private String cuerpo;
    private Boolean enviado;

    public Email(String cuerpo, Boolean enviado) {
        this.cuerpo = cuerpo;
        this.enviado = enviado;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Boolean getEnviado() {
        return enviado;
    }

    public void cambiarEstadoEnviado() {
        this.enviado = !this.enviado;
    }
}
