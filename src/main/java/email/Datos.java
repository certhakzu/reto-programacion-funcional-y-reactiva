package email;

import java.util.List;

public class Datos {
    private List<Email> listaDeCorreos =
            List.of(new Email("iabarcae@yahoo.es", false), new Email("maeillanes@hotmail.com", true), new Email("osabarca@hotmail.com", true),
                    new Email("cabrigo@garmendia.cl", true), new Email("Sb.nashxo.sk8@hotmail.com", false), new Email("fran.afull@live.cl", true),
                    new Email("carlosaguileram@hotmail.com", true), new Email("ikis_rojo@hotmail.com", false), new Email("daniela_aguilera_m50_otmail.com", true),
                    new Email("vizkala@hotmail.com", true), new Email("alexus3@hotmail.com", true), new Email("capitanaguilera@hotmail.com", true),
                    new Email("apalamosg@hotmail.com", false), new Email("niikhox__@hotmail.com", false), new Email("luuuuuuci@hotmail.com", true),
                    new Email("angelicabergez@gmail.com", false), new Email("aarriagada@petrok.cl", true), new Email("martacam2002@yahoo.com", true),
                    new Email("fran.afull@live.cl", true), new Email("bad.girl.-.es", false), new Email("bad.girl.-@hotmail.es", true),
                    new Email("jabravot@yahoo.es", true), new Email("apalamosg@hotmail.com", false), new Email("leonor.araya@gmail.com",true),
                    new Email("pbg@endesa.cl", true), new Email("martacam2002@yahoo.com", false), new Email("leonor.araya@gmail.com",true),
                    new Email("faraya@sprint.cl", true), new Email("fran.afull@live.cl", true), new Email("apalamosg@hotmail.com", true));

    public List<Email> getListaDeCorreos() {
        return listaDeCorreos;
    }
}
