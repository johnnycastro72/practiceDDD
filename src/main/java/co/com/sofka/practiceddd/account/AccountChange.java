package co.com.sofka.practiceddd.account;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.practiceddd.account.events.AccountCreated;
import co.com.sofka.practiceddd.account.events.EmailUpdated;
import co.com.sofka.practiceddd.account.events.NameUpdated;

public class AccountChange extends EventChange {
    public AccountChange(Account account) {

        apply((AccountCreated event) -> {
            account.name = event.name();
            account.email = event.email();
        });

        apply((EmailUpdated event) -> {
            account.email = event.email();
        });

        apply((NameUpdated event) -> {
            account.name = event.name();
        });
    }
}
