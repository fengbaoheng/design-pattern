package uml;

public class Adaptor implements Target {
    private final Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
