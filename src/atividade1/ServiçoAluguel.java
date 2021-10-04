package atividade1;

public class ServiçoAluguel {

    private Double preçoHora;
    private Double preçoDia;

    private Taxa taxa;

    public ServiçoAluguel () {}

    public ServiçoAluguel(Double preçoHora, Double preçoDia, Taxa taxa) {
        this.preçoHora = preçoHora;
        this.preçoDia = preçoDia;
        this.taxa = taxa;
    }

    public void processoNota (AluguelDoCarro aluguelDoCarro) {
        long t1 = aluguelDoCarro.getEntrada().getTime();
        long t2 = aluguelDoCarro.getSaida().getTime();
        double horas = (double) (t1-t2)/1000/60/60;

        double pagamentoBasico;

        if (horas<=12) {

            pagamentoBasico = Math.ceil(horas)*preçoHora;

        }
        else
        {
            pagamentoBasico = Math.ceil(horas/24)*preçoDia;

        }

        double tax = taxa.taxa(pagamentoBasico);

        aluguelDoCarro.setNotaFiscal(new NotaFiscal(pagamentoBasico, tax));

    }

}
