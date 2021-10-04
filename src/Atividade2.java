import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Digite os dados do contrato");
        System.out.println("Numero:");
        Long contrato = sc.nextLong();
        System.out.println("Data: (dd/mm/yyyy)");
        Date data = dataFormato.parse(sc.next());
        System.out.println("Valor:");
        Double valor = sc.nextDouble();
        System.out.println("Parcelas:");
        Integer parcelas = sc.nextInt();
        System.out.println("O valor a ser pago por parcela é de: ");


        }


    }

