package ma.enset.comptecqrses.commands_api.commands;

import lombok.Getter;

public class CreditAccountCommand extends BaseCommand<String>{
    @Getter private double amount;
    @Getter private String currency;
    public CreditAccountCommand(String id, double amount, String currency) {
        super(id);
        this.currency=currency;
        this.amount=amount;
    }

}
