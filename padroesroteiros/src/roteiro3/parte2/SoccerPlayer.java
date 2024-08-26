package roteiro3.parte2;

import roteiro3.parte1.*;

public class SoccerPlayer extends Player{
    
    public SoccerPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " trabalha em equipe!");
    }
    
}
