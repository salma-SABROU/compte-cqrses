package ma.enset.comptecqrses.commands_api.events;

import lombok.Getter;
import ma.enset.comptecqrses.commands_api.enums.AccountStatus;

public class AccountActivatedEvent extends BaseEvent<String>{
    @Getter private AccountStatus accountStatus;
    public AccountActivatedEvent(String id,AccountStatus accountStatus) {
        super(id);
        this.accountStatus=accountStatus;
    }
}
