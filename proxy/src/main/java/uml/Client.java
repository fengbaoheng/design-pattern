package uml;

public class Client {
    public Client() {
        new Proxy(new RealSubject()).request();
    }
}
