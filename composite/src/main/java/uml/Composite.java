package uml;

import java.util.LinkedList;
import java.util.List;

public class Composite extends Component {
    List<Component> children = new LinkedList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display() {
        children.forEach(Component::display);
    }
}
