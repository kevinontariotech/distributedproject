import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;


public class Account{
    //this is for the functions that checks the users for login credentials

    private String username;
    private byte[] password;
    private String name;
    private AccountType accountType;
    public enum AccountType {
        USER,
        OWNER,
        ADMIN
    }

    MockDatabase mDatabase = new MockDatabase();

    //make account without name
    public Account (String username, String password) throws Exception {
        this.username = username;
        this.password = encryptPassword(password);
        this.name = username;
        this.accountType = AccountType.USER;
    }

    //make account with name
    public Account (String username, String password, String name) throws Exception{
        this.username = username;
        this.password = encryptPassword(password);
        this.name = name;
        this.accountType = AccountType.USER;
    }

    //make account with specific account type
    public Account (String username, String password, String name, AccountType accountType) throws Exception {
        this.username = username;
        this.password = encryptPassword(password);
        this.name = name;
        this.accountType = accountType;
    }

    public String getUsername() {
        return this.username;
    }

    public String getName () {
        return this.name;
    }

    public AccountType getAccoutType() {
        return this.accountType;
    }

    private byte[] encryptPassword (String password) throws Exception{
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        KeyPair pair = keyPairGen.generateKeyPair();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
        byte[] input = password.getBytes();
        cipher.update(input);
        byte[] cipherText = cipher.doFinal();
        return cipherText;
    }

    public byte[] getEncryptedPassword() {
        return this.password;
    }

    public boolean login (String username, String password) {
        for (Account a : mDatabase.accounts) {
            try {
                if (a.getName() == username && a.getEncryptedPassword() == encryptPassword(password)){
                    return true;
                }
            } catch (Exception e) {}
        }
        return false;
    }
}
