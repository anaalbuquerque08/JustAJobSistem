package models;
import java.util.List;
import java.util.Date;

public class Calendario {
    private final List<Date> datas;
    private final List<String> diasDeTrabalho;

    public Calendario(List<Date> datas, List<String> diasDeTrabalho) {
        this.datas = datas;
        this.diasDeTrabalho = diasDeTrabalho;
    }

    public boolean verificarDatasDisponiveis() {
        return true;
    }
}
