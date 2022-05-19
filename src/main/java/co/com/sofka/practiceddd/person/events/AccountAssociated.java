package co.com.sofka.practiceddd.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.account.values.AccountId;

public class AccountAssociated extends DomainEvent {
    private final AccountId accountId;

    public AccountAssociated(AccountId accountId) {
        super("sofka.person.accountassociated");
        this.accountId = accountId;
    }

    public AccountId accountId() {
        return accountId;
    }
}
