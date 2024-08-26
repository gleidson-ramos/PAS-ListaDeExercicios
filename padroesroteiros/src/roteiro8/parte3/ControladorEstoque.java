package roteiro8.parte3;

public class ControladorEstoque {
    private ISistemaEstoqueAdapter sistemaestoqueAdapter;
    
    
    public ControladorEstoque() {
        System.out.println("Controlador de Sistema Estoque Criado");
    }
    
    public void criarSistemaEstoqueAdapter(String nome){
        if (nome.equals("IBM"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterIBM();
        else if (nome.equals("DELL"))
            this.sistemaestoqueAdapter = new SistemaEstoqueAdapterDELL();
    }
    
    public void aumentarQuantidadeItem(){
        this.sistemaestoqueAdapter.aumentarQuantidadeItem();
    }

}
