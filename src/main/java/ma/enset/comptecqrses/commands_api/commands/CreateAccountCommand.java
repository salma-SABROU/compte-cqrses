package ma.enset.comptecqrses.commands_api.commands;

import lombok.Getter;

public class CreateAccountCommand extends BaseCommand<String>{
    @Getter private double initialBalance;
    @Getter private String currency;
    public CreateAccountCommand(String id, double initialBalance, String currency) {
        super(id);
        this.currency=currency;
        this.initialBalance=initialBalance;
    }

}
