package atividade1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AluguelDoCarro {
    private Date entrada;
    private Date saida;

    SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy  hh:mm");

    public AluguelDoCarro () {
    }

    public AluguelDoCarro(Date entrada, Date saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }
}
