package roteiro1.parte3;

public class ServicoReserva {
    private Connection connection;
    
    public ServicoReserva(Connection c) {
        this.connection = c;
    }
    
    public ServicoReserva(){
        this.connection = new MysqlConnection();
    }
    
    public void criarReserva(){
        this.connection.connect();        
        System.out.println("Lógica de negócio para Reserva de Quarto");
    }
    
}
