package Tarefa_Calculo_Media;

public class Main {


    public static void main(String[] args) {

       System.out.println(calculadorDeMedias(10,10,10,10));
    }

    //Função que recebe 4 números inteiros e retorna a media entre eles
    public static int calculadorDeMedias(int nota1, int nota2, int nota3, int nota4) {
         int media1 = (nota1 + nota2 + nota3 + nota4) / 4 ;
        return media1;
    }
}
