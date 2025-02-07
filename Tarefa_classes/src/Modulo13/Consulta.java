package Modulo13;

public class Consulta {

    public static void main(String[] args) {

        PessoaFisica luciano = new PessoaFisica();
        luciano.setNome("Luciano Novo");
        luciano.setCpf(9999999L);
        System.out.println("Essa empresa tem o nome de " + luciano.getNome() + " e cnpj:" + luciano.getCpf());

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("Mc donalds");
        empresa.setCnpj(9999992L);
        System.out.println("Essa empresa tem o nome de " + empresa.getNome() + " e cnpj:" +empresa.getCnpj());
    }
}


