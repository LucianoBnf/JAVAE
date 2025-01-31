package Tarefa_Controle_de_fluxo;

import java.util.Scanner;

public class Ex10 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int resultado = 0;
        float media;
        for(int i = 1; i < 5; i++) {
            System.out.println("Escreva a " + i + "° nota do aluno !");
            resultado = resultado + s.nextInt();
        }
        media = (float)resultado / 4 ;
        System.out.println("A média entre as 4 notas é " + media);

        if(media >= 7){
            System.out.println("O aluno está aprovado !");
        }
        else if(media >= 5){
            System.out.println("O aluno está de recuperação !");
        }
        else {
            System.out.println("O aluno está reprovado !");
        }
    }
}
