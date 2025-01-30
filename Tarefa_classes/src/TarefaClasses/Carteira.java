package TarefaClasses;

/**
 * @author LucianoNovoFilho
 **/

public class Carteira {

    private int cartoes;

    private String dinheiro;

    private String documentos;

    /**
     *
      * @return retorna a quantidade de cartões na carteira
     */
    public int getCartoes() {
        return cartoes;
    }

    /**
     *
     * @param  cartoes
     */
    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    /**
     *
     * @return retorna a quantidade de dinheiro na carteira
     */
    public String getDinheiro() {
        return dinheiro;
    }

    /**
     *
     * @param dinheiro
     */
    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     *
     * @return retorna os tipos de documentos da carteira
     */
    public String getDocumentos() {
        return documentos;
    }

    /**
     *
     * @param documentos
     */
    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }
}
