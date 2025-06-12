package l6;

interface  Callback{
    void callback(int param);
}
class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with "+p);
    }
}
public class Testface {
    public static void main(String[] args) {
        Client client = new Client();
        client.callback(42);
    }
}
