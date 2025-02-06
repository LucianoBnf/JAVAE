import java.util.Scanner;
import static java.util.Arrays.sort;

public class Parte1 {
    public static void main(String[] args) {
        String resposta;
        String[] nomes;
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva todos os nomes desejados separados por ,");
        resposta = s.nextLine();
        nomes = resposta.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim(); // remove espaços em branco
        }
        sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}