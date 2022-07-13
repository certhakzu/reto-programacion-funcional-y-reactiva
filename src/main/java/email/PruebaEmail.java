package email;

import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PruebaEmail {

    // Punto A
    public List<String> eliminarCorreosRepetidos(List<Email> listaDeCorreos){
        return listaDeCorreos.stream()
                .map(Email::getCuerpo)
                .distinct()
                .collect(Collectors.toList());
    }

    // Punto B
    public List<String> filtrarPorDominiosGmailHotmailOutlook(List<Email> listaDeCorreos){
        return listaDeCorreos.stream()
                .map(Email::getCuerpo)
                .filter(s -> s.contains("@gmail") || s.contains("@hotmail") || s.contains("@outlook"))
                .collect(Collectors.toList());
    }

    // Punto C
    public List<String> correosConFormatoCorrecto(List<Email> listaDeCorreos){
        return listaDeCorreos.stream()
                .map(email -> email.getCuerpo())
                .map(s -> {
                    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                    Matcher mather = pattern.matcher(s);
                    if (Boolean.TRUE.equals(mather.find())) return s;
                    return null;
                }).filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    // Punto D
    public Long contarCorreosDiferentes(List<Email> listaDeCorreos){
        var correosValidos = correosConFormatoCorrecto(listaDeCorreos);
        return correosValidos.stream()
                .distinct().count();
    }

    // Punto E
    public Long contarCorreosGmailHotmailOutlook(List<Email> listaDeCorreos){

        var correosFiltrados = filtrarPorDominiosGmailHotmailOutlook(listaDeCorreos);
        return correosFiltrados.stream()
                .distinct()
                .count();
    }

    // Extra Correos enviados
    public List<String> correosEnviados(List<Email> listaDeCorreos){
        return listaDeCorreos.stream()
                .filter(Email::getEnviado)
                .map(Email::getCuerpo)
                .collect(Collectors.toList());
    }


}
