package atividade2;

public class ServiçoOnlineAtual implements PagamentoOnline {

    private static final double taxa = 0.02;
    private static final double juros = 0.01;

    public double taxa(double valor) {
        return valor*taxa;
    }


    public double juros(double valor, int meses) {
        return valor*meses*juros;
    }
}
