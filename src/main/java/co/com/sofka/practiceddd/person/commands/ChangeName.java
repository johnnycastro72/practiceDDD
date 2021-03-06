package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.person.values.Name;
import co.com.sofka.practiceddd.person.values.PersonId;

public class ChangeName extends Command {
    private final PersonId personId;
    private final Name name;

    public ChangeName(PersonId personId, Name name) {
        this.personId = personId;
        this.name = name;
    }

    public PersonId personId() {
        return personId;
    }

    public Name name() {
        return name;
    }
}
