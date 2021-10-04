

import atividade2.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        PagamentoOnline pgo = new ServiçoOnlineAtual();
        ServiçoContrato contract = new ServiçoContrato(pgo);

        System.out.println("Digite os dados do contrato");
        System.out.println("Numero:");
        Long contrato = sc.nextLong();
        System.out.println("Data: (dd/mm/yyyy)");
        Date data = dataFormato.parse(sc.next());
        System.out.println("Valor:");
        Double valor = sc.nextDouble();

        Contrato cont = new Contrato(contrato,data,valor);

        System.out.println("Parcelas:");
        Integer parcelas = sc.nextInt();

        ServiçoContrato serviçoContrato = new ServiçoContrato(new ServiçoOnlineAtual());
        serviçoContrato.processandoContrato(cont,parcelas);

        System.out.println("O valor a ser pago por parcela é de: ");
        for (Parcelas parcela: cont.getParcelas()) {
            System.out.println(parcela);
        }
        sc.close();


        }


    }

