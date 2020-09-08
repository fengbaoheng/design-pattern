package uml;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new LinkedList<>();

    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }


    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
