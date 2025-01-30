package TarefaClasses;

/**
 * @author LucianoNovoFilho
 **/
public class Pessoa {

     public static void main(String[] args) {

         Carteira bolso = new Carteira();
         bolso.setCartoes(3);
         System.out.println("Eu tenho " + bolso.getCartoes() + " cartões no bolso e");

         bolso.setDinheiro("25R$");
         System.out.println("Eu tenho " + bolso.getDinheiro()+" no bolso e");

         bolso.setDocumentos("RG e CNH");
         System.out.println("Eu tenho no meu bolso " + bolso.getDocumentos());

     }
}
