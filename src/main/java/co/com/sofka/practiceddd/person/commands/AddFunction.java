package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.person.values.Description;
import co.com.sofka.practiceddd.person.values.Feature;
import co.com.sofka.practiceddd.person.values.FunctionId;
import co.com.sofka.practiceddd.person.values.PersonId;

public class AddFunction extends Command {
    private final PersonId personId;
    private final FunctionId entityId;
    private final Feature feature;
    private final Description description;

    public AddFunction(PersonId personId, FunctionId entityId, Feature feature, Description description) {
        this.personId = personId;
        this.entityId = entityId;
        this.feature = feature;
        this.description = description;
    }

    public PersonId personId() {
        return personId;
    }

    public FunctionId entityId() {
        return entityId;
    }

    public Feature feature() {
        return feature;
    }

    public Description description() {
        return description;
    }
}
