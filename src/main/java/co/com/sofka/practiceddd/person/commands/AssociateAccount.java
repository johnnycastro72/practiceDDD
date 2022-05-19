package co.com.sofka.practiceddd.person.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.person.values.PersonId;

public class AssociateAccount extends Command {
    private final PersonId personId;
    private final AccountId accountId;

    public AssociateAccount(PersonId personId, AccountId accountId) {
        this.personId = personId;
        this.accountId = accountId;
    }

    public PersonId personId() {
        return personId;
    }

    public AccountId accountId() {
        return accountId;
    }
}
