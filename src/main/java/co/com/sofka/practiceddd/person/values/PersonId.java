package co.com.sofka.practiceddd.person.values;

import co.com.sofka.domain.generic.Identity;

public class PersonId extends Identity {

    public PersonId() {
    }

    private PersonId(String id) {
        super(id);
    }

    public static PersonId of(String id) {
        return new PersonId(id);
    }
}
