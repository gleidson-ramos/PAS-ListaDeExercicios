package roteiro1.parte3;

public class RelatorioReserva {
    private Connection connection;
    
    public RelatorioReserva(Connection c) {
        this.connection = c;
    }
     
    public RelatorioReserva(){
        this.connection = new MysqlConnection();
    }
    
    public void gerarRelatorio(){
        this.connection.connect();        
        System.out.println("Lógica de negócio para geração de relatório");
    }
    
}
