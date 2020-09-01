package clone.deep.recursive;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Customer implements Cloneable {
    private String name;
    private int age;
    private int phone;
    private Address address;

    public Customer() {
    }

    public Customer(String name, int age, int phone, Address address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public Customer(String name, int age, int phone, String city, String street, int post) {
        this(name, age, phone, new Address(city, street, post));
    }

    @Override
    public Customer clone() throws CloneNotSupportedException {
        Customer clone = (Customer) super.clone();
        clone.address = this.address.clone();
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getAge() == customer.getAge() &&
                getPhone() == customer.getPhone() &&
                Objects.equals(getName(), customer.getName()) &&
                Objects.equals(getAddress(), customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getPhone(), getAddress());
    }
}
