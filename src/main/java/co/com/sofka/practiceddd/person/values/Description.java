package co.com.sofka.practiceddd.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {
    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Description can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Description must be longer than five characters");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("Description must be smaller than one hundred characters");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
