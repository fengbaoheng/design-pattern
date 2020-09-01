package clone.deep.serialize;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class Address implements Serializable {
    private String city;
    private String street;
    private int post;

    public Address() {
    }

    public Address(String city, String street, int post) {
        this.city = city;
        this.street = street;
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getPost() == address.getPost() &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(getStreet(), address.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getPost());
    }
}
