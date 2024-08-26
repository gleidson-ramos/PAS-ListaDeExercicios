package roteiro3.parte2;

import roteiro3.parte1.*;

public class GolfPlayer extends Player{
    
    public GolfPlayer (String nome){
        super(nome);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.nome + " pontua co o nº centro de tacadas");
    }
    
    @Override
    public void correr(){
        System.out.println(super.nome + " ele não corre! ele pensa!");
    }
    
}
