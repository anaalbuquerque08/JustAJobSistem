package models;
import java.util.Date;

public class Visita {
    private final Date dataHora;
    private final String status;

    public Visita(Date dataHora, String status) {
        this.dataHora = dataHora;
        this.status = status;
    }
}
