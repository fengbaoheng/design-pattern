package clone.deep.serialize;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.Objects;


@Getter
@Setter
public class Customer implements Cloneable, Serializable {
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
    public Customer clone() {
        Customer customer = null;

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            customer = (Customer) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return customer;
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
