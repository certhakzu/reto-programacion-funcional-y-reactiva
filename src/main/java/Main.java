import email.Datos;import email.Email;
import email.PruebaEmail;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PruebaEmail pruebaEmail = new PruebaEmail();
        Datos collect = new Datos();
        System.out.println(">>> Lista de Emails sin Repeticiones:\n"
                + pruebaEmail.eliminarCorreosRepetidos(collect.getListaDeCorreos()));
        System.out.println(">>> Lista de Emails Gmail, Hotmail, Outlook:\n"
                + pruebaEmail.filtrarPorDominiosGmailHotmailOutlook(collect.getListaDeCorreos()));
        System.out.println(">>> Lista de Email con formato correcto:\n"
                + pruebaEmail.correosConFormatoCorrecto(collect.getListaDeCorreos()));
        System.out.println(">>> Cantidad de Correos Validos y sin repetir:\n"
                + pruebaEmail.contarCorreosDiferentes(collect.getListaDeCorreos()));
        System.out.println(">>> Cantidad de Correos con Dominios Gmail, Hotmail, Outloook:\n"
                + pruebaEmail.contarCorreosGmailHotmailOutlook(collect.getListaDeCorreos()));
        System.out.println(">>> Correos Enviados: "
                + pruebaEmail.correosEnviados(collect.getListaDeCorreos()));
    }
}
