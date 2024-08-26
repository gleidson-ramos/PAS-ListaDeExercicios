package roteiro3.parte1;

public abstract class Player {
    protected String nome;
    
    public Player (String nome){
        this.nome = nome;
    }
    
    public void treinar(){
        System.out.println(this.nome + " executando o treino!");
    }
    
    public void estiloCompetidor(){
        System.out.println(this.nome + " muito competitivo");
    }
    
    public abstract void definirTatica();
    
}
