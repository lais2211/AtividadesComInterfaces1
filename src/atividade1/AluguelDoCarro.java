package atividade1;


import java.text.SimpleDateFormat;
import java.util.Date;

public class AluguelDoCarro {

    private static SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy HH:ss");

    private Date entrada;
    private Date saida;
    private Veiculo veiculo;
    private NotaFiscal notaFiscal;





    public AluguelDoCarro(Date entrada, Date saida, Veiculo veiculo) {
        this.entrada = entrada;
        this.saida = saida;
        this.veiculo = veiculo;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
