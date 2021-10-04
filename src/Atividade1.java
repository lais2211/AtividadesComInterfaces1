import atividade1.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("Dados do aluguel: ");
        System.out.println("Modelo do carro: ");
        String modelo = sc.next();
        System.out.println("Retirada: (dd/mm/yyyy hh:mm) ");
        Date entrada = dataFormato.parse(sc.next());
        System.out.println("Devolução: (dd/mm/yyyy hh:mm) ");
        Date saida = dataFormato.parse(sc.nextLine());
        System.out.println("Digite o preço por hora: ");
        Double preçoHora= sc.nextDouble();;
        System.out.println("Digite o preço por dia: ");
        Double preçoDia = sc.nextDouble();
        AluguelDoCarro aluguelDoCarro = new AluguelDoCarro(entrada,saida,new Veiculo(modelo));
        ServiçoAluguel aluguel = new ServiçoAluguel(preçoHora,preçoDia,new BrasilTaxa());
        aluguel.processoNota(aluguelDoCarro);
        System.out.println("NOTA FISCAL: ");
        System.out.println("Pagamento basico: "+ aluguelDoCarro.getNotaFiscal().getPagamentoBasico());
        System.out.println("Taxa: "+aluguelDoCarro.getNotaFiscal().getTaxa());
        System.out.println("Pagamento total: "+aluguelDoCarro.getNotaFiscal().getPagamentoTotal());
        sc.close();

    }
}
