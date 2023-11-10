package ma.enset.comptecqrses.query.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.comptecqrses.commands_api.enums.AccountStatus;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String id ;
    private double balance ;
    @Enumerated(EnumType.STRING)
    private AccountStatus status ;
    private String currency ;
    @OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
    private Collection<Operation> operations;
}
