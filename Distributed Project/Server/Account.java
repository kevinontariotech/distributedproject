public class Account{
    //this is for the functions that checks the users for login credentials

    private String username;
    private String password;
    private String name;
    private AccountType accountType;
    private enum AccountType {
        USER,
        OWNER,
        ADMIN
    }

    //make account without name
    public Account (String username, String password) {
        this.username = username;
        this.password = password;
        this.name = username;
        this.accountType = AccountType.USER;
    }

    //make account with name
    public Account (String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.accountType = AccountType.USER;
    }

    //make account with specific account type
    public Account (String username, String password, String name, AccountType accountType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.accountType = accountType;
    }

    public String getName () {
        return this.name;
    }

    private void encryptPassword (String password) {
        
    }
}
