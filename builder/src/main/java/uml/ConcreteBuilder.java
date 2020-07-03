package uml;

/**
 * 具体建造者
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildPartC() {

    }

    @Override
    public Product getResult() {
        return product;
    }
}
