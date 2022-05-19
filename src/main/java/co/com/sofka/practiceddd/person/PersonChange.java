package co.com.sofka.practiceddd.person;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.practiceddd.person.events.*;

import java.util.HashSet;

public class PersonChange extends EventChange {
    public PersonChange(Person person) {

        apply((PersonCreated event) -> {
            person.name = event.name();
            person.functions = new HashSet<>();
        });

        apply((AccountAssociated event) -> {
            person.accountId = event.accountId();
        });

        apply((FunctionDescriptionUpdated event) -> {
            var function = person.getFunctionById(event.entityId())
                    .orElseThrow(() -> new IllegalArgumentException("Person's function not found"));
            function.updateDescription(event.description());
        });

        apply((FunctionFeatureUpdated event) -> {
            var function = person.getFunctionById(event.entityId())
                    .orElseThrow(() -> new IllegalArgumentException("Person's feature not found"));
            function.updateFeature(event.feature());
        });

        apply((FunctionAdded event) -> {
            int functionsSize = person.functions().size();
            if (functionsSize == 6) {
                throw new IllegalArgumentException("You can't add more functions, you can only have 6 of them");
            }
            person.functions.add(new Function(
                    event.functionId(),
                    event.feature(),
                    event.description()
            ));
        });

        apply((NameChanged event) -> {
            person.name = event.name();
        });

    }
}
