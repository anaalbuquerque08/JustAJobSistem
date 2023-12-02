package models;
import java.util.Date;

public class Servico {
    private final Date dataHora;
    private final double valor;

    public Servico(Date dataHora, double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
    }
    public Date getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }

    public String gerarTipoDeServico() {
        return "Serviço gerado";
    }
}
