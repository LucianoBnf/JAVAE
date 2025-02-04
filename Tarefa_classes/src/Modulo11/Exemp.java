package Modulo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemp {

    public static void main(String[] args) {

        listaAluno();
        }

    public static void listaAluno(){

        List<Aluno> lista = new ArrayList<Aluno>();
        Aluno a = new Aluno("Luciano" , "Linux" , 10.0);
        Aluno b = new Aluno("João" ,"Minecraft" ,30.0);
        Aluno c = new Aluno("Beatriz" , "dança", 20.0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        CompararAluno compararAluno = new CompararAluno();
        Collections.sort(lista, compararAluno);
        System.out.println(lista);
    }

}


