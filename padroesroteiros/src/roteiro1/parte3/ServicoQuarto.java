package roteiro1.parte3;

public class ServicoQuarto {
    private Connection connection;
    
    public ServicoQuarto(Connection c) {
        this.connection = c;
    }
    
    public ServicoQuarto(){
        this.connection = new MysqlConnection();
    }
    
    public void verificarQuarto(){
        this.connection.connect();
        System.out.println("Lógica de negócio para Serviço de Quarto");
    }
    
}
