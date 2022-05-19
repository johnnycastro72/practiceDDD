package co.com.sofka.practiceddd.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.account.values.Email;
import co.com.sofka.practiceddd.account.values.Name;

public class AccountCreated extends DomainEvent {
    private final Name name;
    private final Email email;

    public AccountCreated(Name name, Email email) {
        super("sofka.account.accountcreated");
        this.name = name;
        this.email = email;
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }
}
