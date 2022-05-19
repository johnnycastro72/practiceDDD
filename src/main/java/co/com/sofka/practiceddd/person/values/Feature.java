package co.com.sofka.practiceddd.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Feature implements ValueObject<String> {

    private final String value;

    public Feature(String value) {

        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("The feature can't be blank");
        }
    }
    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return value.equals(feature.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
