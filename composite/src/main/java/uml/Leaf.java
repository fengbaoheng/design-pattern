package uml;

public class Leaf extends Component {
    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
