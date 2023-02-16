package demo.shop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Address {

    private String city;

    @Override
    public String toString() {
        return "Address!!{" +
                "city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity());
    }
}
