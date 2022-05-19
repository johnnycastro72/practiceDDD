package co.com.sofka.practiceddd.account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Name can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Name must be longer than five characters");
        }

        if (this.value.length() > 100) {
            throw new IllegalArgumentException("Name must be smaller than one hundred characters");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
