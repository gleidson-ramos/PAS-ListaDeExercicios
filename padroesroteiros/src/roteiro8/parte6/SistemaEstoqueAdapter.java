package roteiro8.parte6;
import servico.SistemaEstoque;

public abstract class SistemaEstoqueAdapter {
    protected SistemaEstoque sistemaestoque;
    
    public void aumentarQuantidadeItem() {
        this.sistemaestoque.adicionarItemEstoque();
    }
    
    public void diminuirQuantidadeItem() {
        this.sistemaestoque.removerItemEstoque();
    }
    
}