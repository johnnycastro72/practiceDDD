package co.com.sofka.practiceddd.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.practiceddd.account.values.Email;

public class EmailUpdated extends DomainEvent {

    private final Email email;

    public EmailUpdated(Email email) {
        super("sofka.account.emailupdated");
        this.email = email;
    }

    public Email email() {
        return email;
    }
}
