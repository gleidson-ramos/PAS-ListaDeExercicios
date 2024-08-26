package roteiro3.parte2;

public class ChessPlayer extends Player{
    
    public ChessPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " domina o centro do tabuleiro");
    }
    
    @Override
    public void correr(){
        System.out.println(super.nome + " ele não corre! ele pensa!");
    }
    
}
