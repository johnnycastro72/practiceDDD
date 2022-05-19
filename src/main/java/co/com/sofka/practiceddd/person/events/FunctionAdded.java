package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.person.values.Description;
import co.com.sofka.practiceddd.person.values.Feature;
import co.com.sofka.practiceddd.person.values.FunctionId;

public class FunctionAdded extends DomainEvent {
    private final FunctionId functionId;
    private final Feature feature;
    private final Description description;

    public FunctionAdded(FunctionId functionId, Feature feature, Description description) {
        super("sofka.person.functionadded");
        this.functionId = functionId;
        this.feature = feature;
        this.description = description;
    }

    public FunctionId functionId() {
        return functionId;
    }

    public Feature feature() {
        return feature;
    }

    public Description description() {
        return description;
    }
}
