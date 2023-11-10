package ma.enset.comptecqrses.commands_api.dtos;

import lombok.Data;

@Data
public class DebitAccountRequestDTO {
    private String accountId;

    private double amount;
    private String currency;
}
