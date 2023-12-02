package models;

public class Fatura {
    private final Orcamento orcamento;
    private final Cliente cliente;

    public Fatura(Orcamento orcamento, Cliente cliente) {
        this.orcamento = orcamento;
        this.cliente = cliente;
    }

    public void emitirFatura() {
        System.out.println("Fatura emitida para: " + cliente.getNomeCompleto());
    }

    public void imprimirFatura() {
        System.out.println("Fatura impressa para: " + cliente.getNomeCompleto());
    }
}
