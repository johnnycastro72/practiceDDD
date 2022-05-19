package co.com.sofka.practiceddd.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.account.values.Name;

public class NameUpdated extends DomainEvent {
    private final Name name;

    public NameUpdated(Name name) {
        super("sofka.account.nameupdated");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
