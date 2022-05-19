package co.com.sofka.practiceddd.person.values;

import co.com.sofka.domain.generic.Identity;

public class FunctionId extends Identity {

    public FunctionId() {
    }

    private FunctionId(String id) {
        super(id);
    }

    public static FunctionId of(String id) {
        return new FunctionId(id);
    }

}
