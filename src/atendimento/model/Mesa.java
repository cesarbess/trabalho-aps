
package atendimento.model;

public class Mesa {
    
    private boolean estaLivre;
    private Integer id;
    private Comanda comanda;

    public Mesa(Integer id, boolean estaLivre){
        this.id = id;
        this.estaLivre = estaLivre;
    }
    
    public Mesa(Integer id){
        this.id = id;
        this.estaLivre = true;
    }

    public boolean isEstaLivre() {
        return estaLivre;
    }

    public void setEstaLivre(boolean estaLivre) {
        this.estaLivre = estaLivre;
    }
    
    public Comanda getComanda() {
        return comanda;
    }
    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean possuiComandaAtivaNaCozinha() {
        return this.comanda.possuiItemAtivoNaCozinha();
    }
}
