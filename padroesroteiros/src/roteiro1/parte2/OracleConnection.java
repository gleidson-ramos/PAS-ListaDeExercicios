package roteiro1.parte2;

public class OracleConnection {
    private OracleConnection connection;
            
    public void connect(){
        System.out.println("Conectando com o Oracle");
    }

    public OracleConnection getConnection() {
        return connection;
    }

    public void setConnection(OracleConnection connection) {
        this.connection = connection;
    }
    
}
