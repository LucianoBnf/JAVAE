package Modulo12;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Parte1 {

    public static void main(String[] args) {

        String resposta;
        String[] nomes;

        Scanner s = new Scanner(System.in);

        System.out.println("Escreva todos os nomes desejados separados por , ");
        resposta = s.nextLine();

        nomes = resposta.split(",");
        sort(nomes);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
