package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.person.values.Name;

public class NameChanged extends DomainEvent {
    private final Name name;

    public NameChanged(Name name) {
        super("sofka.person.namechanged");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
