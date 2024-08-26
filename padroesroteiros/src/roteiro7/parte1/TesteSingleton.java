package roteiro7.parte1;

public class TesteSingleton {
    public static void main(String[] args) {
        
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println(db1 == db2 ? "Instâncias iguais" : "Instâncias diferentes");    
    }
}