package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.person.values.Feature;
import co.com.sofka.practiceddd.person.values.FunctionId;

public class FunctionFeatureUpdated extends DomainEvent {
    private final FunctionId entityId;
    private final Feature feature;

    public FunctionFeatureUpdated(FunctionId entityId, Feature feature) {
        super("sofka.person.functionfeatureupdated");
        this.entityId = entityId;
        this.feature = feature;
    }

    public FunctionId entityId() {
        return entityId;
    }

    public Feature feature() {
        return feature;
    }
}
