package atividade2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Long numeroDoContrato;
    private Date data;
    private Double valorTotal;

    List<Parcelas> parcelas = new ArrayList<>();

    public Contrato (Long numeroDoContrato,Date data, Double valorTotal) {
        this.numeroDoContrato=numeroDoContrato;
        this.data=data;
        this.valorTotal=valorTotal;

    }

    public Long getNumeroDoContrato() {
        return numeroDoContrato;
    }

    public void setNumeroDoContrato(Long numeroDoContrato) {
        this.numeroDoContrato = numeroDoContrato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }
}




