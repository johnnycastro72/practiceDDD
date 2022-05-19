package co.com.sofka.practiceddd.person;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.practiceddd.person.values.Description;
import co.com.sofka.practiceddd.person.values.Feature;
import co.com.sofka.practiceddd.person.values.FunctionId;

import java.util.Objects;

public class Function extends Entity<FunctionId> {

    private Feature feature;
    private Description description;

    public Function(FunctionId entityId, Feature feature, Description description) {
        super(entityId);
        this.feature = feature;
        this.description = description;
    }

    public void updateDescription(Description description) {
        this.description = Objects.requireNonNull(description);
    }

    public void updateFeature(Feature feature) {
        this.feature = Objects.requireNonNull(feature);
    }

    public Description description() {
        return description;
    }

    public Feature feature() {
        return feature;
    }
}
