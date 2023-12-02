package models;

public class Orcamento {
    private final String tamanhoDaResidencia;
    private final String tipoDeResidencia;
    private final double valorPorMetroQuadrado;

    public Orcamento(String tamanhoDaResidencia, String tipoDeResidencia, double valorPorMetroQuadrado) {
        this.tamanhoDaResidencia = tamanhoDaResidencia;
        this.tipoDeResidencia = tipoDeResidencia;
        this.valorPorMetroQuadrado = valorPorMetroQuadrado;
    }

    public String gerarOrcamento() {
        return "Orçamento gerado";
    }
}
