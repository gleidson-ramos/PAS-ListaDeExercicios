package roteiro1.parte2;

public class ServicoReserva {
    
    public void criarReserva(){
        OracleConnection connection = new OracleConnection();
        connection.connect();
        
        System.out.println("Lógica de negócio para Reserva de Quarto");
    }
    
}
