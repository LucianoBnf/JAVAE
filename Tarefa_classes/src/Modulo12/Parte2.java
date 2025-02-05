package Modulo12;

import java.util.Arrays;
import java.util.Scanner;

public class Parte2 {

    public static void main(String[] args) {

        String[] nomes;
        String[] nomesM = new String[5];
        String[] nomesF = new String[5];
        String resposta;
        int auxM = 0;
        int auxF = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Escreva um nome e um sexo usando virgúla entre eles ex :[João-M,Maria-F] ");
        resposta = s.nextLine();

        nomes = resposta.split(",");

        for(int i = 0; i < nomes.length; i++) {

            if (nomes[i].contains("-m")) {
                nomesM[auxM] = Arrays.toString(nomes[i].split("-m"));
                auxF--;
            }
            else if(nomes[i].contains("-f")) {
                nomesF[auxF] = Arrays.toString(nomes[i].split("-f"));
                auxM--;
            }
            auxM++;
            auxF++;
        }

        System.out.println("--------------lista masculina---------------");
            for(int i = 0; i < nomesM.length; i++) {
            System.out.println(nomesM[i]);
            }
        System.out.println(" ");

        System.out.println("--------------lista feminina-------");
            for(int i = 0; i < nomesF.length; i++) {
            System.out.println(nomesF[i]);
            }
    }
}
