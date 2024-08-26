package roteiro3.parte2;

import roteiro3.parte1.*;

public class CardPlayer extends Player{
    
    public CardPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " é um jogador muito calmo");
    }
    
    @Override
    public void correr(){
        System.out.println(super.nome + " ele não corre! ele pensa!");
    }
    
}
