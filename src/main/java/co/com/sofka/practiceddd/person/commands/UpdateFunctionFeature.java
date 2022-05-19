package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.person.values.Feature;
import co.com.sofka.practiceddd.person.values.FunctionId;
import co.com.sofka.practiceddd.person.values.PersonId;

public class UpdateFunctionFeature extends Command {
    private final PersonId personId;
    private final FunctionId entityId;
    private final Feature feature;

    public UpdateFunctionFeature(PersonId personId, FunctionId entityId, final Feature feature) {
        this.personId = personId;
        this.entityId = entityId;
        this.feature = feature;
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
}
