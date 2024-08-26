package roteiro1.parte2;

public class ServicoQuarto {
    
    public void verificarQuarto(){
        OracleConnection connection = new OracleConnection();
        connection.connect();
        
        System.out.println("Lógica de negócio para Serviço de Quarto");
    }
    
}
