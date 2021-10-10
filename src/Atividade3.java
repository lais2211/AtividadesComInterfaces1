import atividade3.EntradaLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o arquivo: ");
        String arquivo = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            Set<EntradaLog> set = new HashSet<>();

            String linha = br.readLine();
            while (linha != null) {

                String [] fields = linha.split(" ");
                String nome = fields [0];
                Date data = Date.from(Instant.parse(fields [1]));

               set.add(new EntradaLog(nome,data));

                linha = br.readLine();

            }

            System.out.println("Total de usuarios: "+ set.size());

        }
        catch (IOException e) {
            System.out.println("Erro: "+ e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Erro: "+ b.getMessage());
        }

sc.close();
    }
}
