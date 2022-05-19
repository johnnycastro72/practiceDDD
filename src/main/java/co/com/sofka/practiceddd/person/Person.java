package co.com.sofka.practiceddd.person;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.person.events.PersonCreated;
import co.com.sofka.practiceddd.person.values.*;

import java.util.Objects;
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
        appendChange(new FunctionAdded(entityId, feature, description));
    }
}
