package co.com.sofka.practiceddd.account.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.account.values.Email;
import co.com.sofka.practiceddd.account.values.Name;

public class CreateAccount extends Command {

    private final AccountId accountId;
    private final Name name;
    private final Email email;

    public CreateAccount(AccountId accountId, Name name, Email email) {

        this.accountId = accountId;
        this.name = name;
        this.email = email;
    }

    public AccountId accountId() {
        return accountId;
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }
}
