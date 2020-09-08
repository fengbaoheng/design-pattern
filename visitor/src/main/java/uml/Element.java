package uml;

public interface Element {
    void accept(Visitor visitor);
}
