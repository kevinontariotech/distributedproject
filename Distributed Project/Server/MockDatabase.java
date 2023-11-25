import java.util.ArrayList;
import java.util.List;

import Server.Account.AccountType;

public class MockDatabase {
    //this class just holds all the information that should be in the database
    List<ItemFile> items = new ArrayList<ItemFile>();
    List<Account> accounts = new ArrayList<Account>();
    List<ActionLog> logs = new ArrayList<ActionLog>();

    MockDatabase() {
        Account account0 = new Account("User1", "password", "John Doe", AccountType.ADMIN);
        Account account1 = new Account("User2", "password", "May Smith", AccountType.OWNER);
        Account account2 = new Account("User3", "password", "Mary Jane");
        accounts.add(account0);
    }
}
