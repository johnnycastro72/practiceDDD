package co.com.sofka.practiceddd.account.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.account.values.AccountId;
import co.com.sofka.practiceddd.account.values.Name;

public class UpdateName extends Command {

    private final AccountId accountId;
    private final Name name;

    public UpdateName(AccountId accountId, Name name) {
        this.accountId = accountId;
        this.name = name;
    }

    public AccountId accountId() {
        return accountId;
    }

    public Name name() {
        return name;
    }
}
