package roteiro3.parte3;

public class SoccerPlayer extends Player implements Runnable{
    
    public SoccerPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " trabalha em equipe!");
    }
    
    @Override
    public void correr(){
        System.out.println(this.nome + " corre muito durante o jogo");
    }
    
}
