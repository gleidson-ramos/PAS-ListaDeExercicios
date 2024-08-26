package roteiro1.parte2;

public class RelatorioReserva {
     
    public void gerarRelatorio(){
        OracleConnection connection = new OracleConnection();
        connection.connect();
        
        System.out.println("Lógica de negócio para geração de relatório");
    }
    
}
