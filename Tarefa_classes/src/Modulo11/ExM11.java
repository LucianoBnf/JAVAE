package Modulo11;

import java.util.ArrayList;
import java.util.Scanner;

public class ExM11 {

    public static void main(String[] args) {

        String resposta;
        String resposta1 = "aa";

        ArrayList<String> masculino = new ArrayList<String>();
        ArrayList<String> feminino = new ArrayList<String>();

        Scanner s = new Scanner(System.in);

        System.out.println("Escreva seu nome :");
        resposta = s.nextLine();

        while(!resposta1.equals("masculino") && !resposta1.equals("Masculino") && !resposta1.equals("feminino") && !resposta1.equals("Feminino")) {

            System.out.println("É do sexo Masculino ou Feminino ?");
            resposta1 = s.nextLine();
            System.out.println("");

            if (resposta1.equals("Masculino") || resposta1.equals("masculino")) {

                masculino.add(resposta);
            }
            else if (resposta1.equals("Feminino") || resposta1.equals("feminino")) {

                feminino.add(resposta);
            }
            else {

                System.out.println("Escolha feminino ou masculino !");
                System.out.println("");
                resposta1 = s.nextLine();
            }
        }
        System.out.println("**** Mostrando lista Masculina *****");
        System.out.println(masculino);
        System.out.println("");
        System.out.println("**** Mostrando lista Feminina *****");
        System.out.println(feminino);
        System.out.println("");
    }
}
