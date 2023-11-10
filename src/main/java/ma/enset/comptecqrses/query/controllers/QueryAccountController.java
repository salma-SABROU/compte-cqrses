package ma.enset.comptecqrses.query.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.comptecqrses.query.entities.Account;
import ma.enset.comptecqrses.query.queries.GetAccountByIdQuery;
import ma.enset.comptecqrses.query.queries.GetAllAccountQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/query/accounts")
@AllArgsConstructor
@Slf4j
public class QueryAccountController {
    private QueryGateway queryGateway;

    @GetMapping("/allAccounts")
    public List<Account> accountList() {
        log.info("Handling a AccountCreatedEvent command with information:");
        List<Account> response=queryGateway.query(new GetAllAccountQuery(), ResponseTypes.multipleInstancesOf(Account.class)).join();
        return response;
    }

    @GetMapping("byId/{id}")
    public Account accountById(@PathVariable String id) {
        log.info("Handling a AccountCreatedEvent command with information:");
        return queryGateway.query(new GetAccountByIdQuery(id), ResponseTypes.instanceOf(Account.class)).join();
    }

}
