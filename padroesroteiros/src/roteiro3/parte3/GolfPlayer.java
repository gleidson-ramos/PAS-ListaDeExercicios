package roteiro3.parte3;

public class GolfPlayer extends Player{
    
    public GolfPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " pontua co o nº centro de tacadas");
    }
    
}
