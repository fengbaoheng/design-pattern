package uml;

public class Facade {
    private SubSystemA A;
    private SubSystemB B;

    public Facade() {
        A = new SubSystemA();
        B = new SubSystemB();
    }

    public void method() {
        A.methodA();
        B.methodB();
    }
}
