package co.com.sofka.practiceddd.account.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.practiceddd.person.values.FunctionId;

public class AccountId extends Identity {

    public AccountId() {
    }

    private AccountId(String id) {
        super(id);
    }

    public static AccountId of(String id) {
        return new AccountId(id);
    }


}
