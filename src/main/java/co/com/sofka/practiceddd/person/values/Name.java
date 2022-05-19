package co.com.sofka.practiceddd.person.values;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {
    private String value;

    @Override
    public String value() {
        return value;
    }
}
