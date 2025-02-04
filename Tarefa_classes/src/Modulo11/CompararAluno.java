package Modulo11;

import java.util.Comparator;

public class CompararAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno b1, Aluno b2) {

        return Double.compare(b1.getNota(), b2.getNota());

    }
}
