package co.com.sofka.practiceddd.account.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.practiceddd.account.values.Email;

public class UpdateEmail extends Command {

    private final Email email;

    public UpdateEmail(Email email) {
        this.email = email;
    }

    public Email email() {
        return email;
    }
}
