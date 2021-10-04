package atividade2;
import java.util.Date;
import java.util.Calendar;

public class ServiçoContrato {
    private PagamentoOnline pagamentoOnline;

    public ServiçoContrato () {}

    public ServiçoContrato (PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline=pagamentoOnline;
    }

    public void processandoContrato (Contrato contrato, int meses) {
        double valorBase = contrato.getValorTotal() / meses;

        for (int i=1; i<=meses; i++) {

            double atualizandoValorBase = valorBase + pagamentoOnline.juros(valorBase,i);
            double valorBaseTotal = atualizandoValorBase + pagamentoOnline.taxa(atualizandoValorBase);

            Date addMeses = addMeses(contrato.getData(),i);
            contrato.getParcelas().add(new Parcelas(addMeses,valorBaseTotal));

        }

    }

   private Date addMeses (Date data, int n) {

       Calendar calendario = Calendar.getInstance();
       calendario.setTime(data);
       calendario.add(Calendar.MONTH, n);
       return calendario.getTime();

   }


}
