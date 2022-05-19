package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.person.values.Name;

public class PersonCreated extends DomainEvent {
    private final Name name;

    public PersonCreated(Name name) {
        super("Sofka.person.personcreated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
