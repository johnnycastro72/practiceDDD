package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.person.values.Description;
import co.com.sofka.practiceddd.person.values.FunctionId;
import co.com.sofka.practiceddd.person.values.PersonId;

public class UpdateFunctionDescription extends Command {
    private final PersonId personId;
    private final FunctionId entityId;
    private final Description description;

    public UpdateFunctionDescription(PersonId personId, FunctionId entityId, Description description) {
        this.personId = personId;
        this.entityId = entityId;
        this.description = description;
    }

    public PersonId personId() {
        return personId;
    }

    public FunctionId entityId() {
        return entityId;
    }

    public Description description() {
        return description;
    }
}
