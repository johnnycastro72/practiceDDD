package co.com.sofka.practiceddd.account;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.account.events.AccountCreated;
import co.com.sofka.practiceddd.account.events.EmailUpdated;
import co.com.sofka.practiceddd.account.events.NameUpdated;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.account.values.Email;
import co.com.sofka.practiceddd.account.values.Name;

import java.util.List;

public class Account extends AggregateEvent<AccountId> {

    protected AccountId accountId;
    protected Name name;
    protected Email email;

    public Account(AccountId accountId, Name name, Email email) {
        super(accountId);
        appendChange(new AccountCreated(name, email)).apply();
    }

    private Account(AccountId entityId) {
        super(entityId);
        subscribe(new AccountChange(this));
    }

    public static Account from(AccountId accountId, List<DomainEvent> events){
        var account = new Account((accountId));
        events.forEach(account::applyEvent);
        return account;
    }

    public void updateEmail(Email email){
        appendChange(new EmailUpdated(email)).apply();
    }

    public void updateName(Name name){
        appendChange(new NameUpdated(name)).apply();
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }
}
