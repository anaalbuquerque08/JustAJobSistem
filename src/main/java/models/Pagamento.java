package models;

public class Pagamento {
    private final String metodoDePagamento;
    private final String status;

    public Pagamento(String metodoDePagamento, String status) {
        this.metodoDePagamento = metodoDePagamento;
        this.status = status;
    }

    public String statusPagamento() {
        return "Status de pagamento verificado";
    }
}
