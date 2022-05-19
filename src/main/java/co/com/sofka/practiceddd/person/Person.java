package co.com.sofka.practiceddd.person;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.person.events.*;
import co.com.sofka.practiceddd.person.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Person extends AggregateEvent<PersonId> {
    protected Name name;
    protected Set<Function> functions;
    protected AccountId accountId;

    public Person(PersonId entityId, Name name) {
        super(entityId);
        appendChange(new PersonCreated(name)).apply();
    }

    public void addFunction(FunctionId entityId, Feature feature, Description description) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(feature);
        Objects.requireNonNull(description);
        appendChange(new FunctionAdded(entityId, feature, description)).apply();
    }

    public void associateAccount( AccountId accountId ) {
        appendChange(new AccountAssociated(accountId)).apply();
    }

    public void changeName( Name name ) {
        appendChange(new NameChanged(name)).apply();
    }

    public void updateFunctionFeature(FunctionId entityId, Feature feature) {
        appendChange(new FunctionFeatureUpdated(entityId, feature)).apply();
    }

    public void updateFunctionDescription(FunctionId entityId, Description description) {
        appendChange(new FunctionDescriptionUpdated(entityId, description)).apply();
    }

    public Optional<Function> getFunctionById(FunctionId entityId) {
        return functions()
                .stream()
                .filter(function -> function.identity().equals(entityId))
                .findFirst();
    }

    public Name name() {
        return name;
    }

    public AccountId accountId() {
        return accountId;
    }

    public Set<Function> functions() {
        return functions;
    }
}
