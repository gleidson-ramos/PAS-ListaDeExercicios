package roteiro1.parte3;

public class OracleConnection implements Connection{
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
