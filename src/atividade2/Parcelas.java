package atividade2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

    private static SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataParcela;
    private Double valor;

    public Parcelas () {}

    public Parcelas(Date dataParcela, Double valor) {
        this.dataParcela = dataParcela;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return dataFormato.format(dataParcela) +
                ", valor: R$" + valor;
    }
}
