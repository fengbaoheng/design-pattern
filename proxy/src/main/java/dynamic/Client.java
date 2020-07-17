package dynamic;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        ClassLoader classLoader = Client.class.getClassLoader();
        Class<?>[] proxyInterfaces = {Subject.class};
        ProxyHandler handler = new ProxyHandler(new RealSubject());

        Subject proxy = (Subject) Proxy.newProxyInstance(classLoader, proxyInterfaces, handler);

        proxy.request();
    }
}
