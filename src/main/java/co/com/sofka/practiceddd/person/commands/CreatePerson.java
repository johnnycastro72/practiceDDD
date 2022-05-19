package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.person.values.Name;
import co.com.sofka.practiceddd.person.values.PersonId;

public class CreatePerson extends Command {
    private final PersonId entityId;
    private final Name name;

    public CreatePerson(PersonId entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public PersonId entityId() {
        return entityId;
    }

    public Name name() {
        return name;
    }
}
