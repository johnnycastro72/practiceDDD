package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.person.values.Description;
import co.com.sofka.practiceddd.person.values.FunctionId;

public class FunctionDescriptionUpdated extends DomainEvent {
    private final FunctionId entityId;
    private final Description description;

    public FunctionDescriptionUpdated(FunctionId entityId, Description description) {
        super("sofka.person.functiondescriptionupdated");
        this.entityId = entityId;
        this.description = description;
    }

    public FunctionId entityId() {
        return entityId;
    }

    public Description description() {
        return description;
    }
}
