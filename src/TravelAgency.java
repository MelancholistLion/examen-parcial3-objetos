import exceptions.*;
import java.util.ArrayList;

public class TravelAgency extends AccountNotFoundException {
    private ArrayList<UserAccount> userAccounts;


    public String addUserAccount(UserAccount userAccount) {
        userAccounts.add(userAccount);
        return userAccount.getId();
    }

    public UserAccount findAccount(String id) {
        for(int i = 0; i < userAccounts.size(); i++) {
            if(id == userAccounts.get(i).getId()) {
                return userAccounts.get(i);
            }
        }
        return null;
    }

    public UserAccount findAccountByEmail(String email) {
        for(int i = 0; i < userAccounts.size(); i++) {
            if(userAccounts.get(i).getEmail() == email) {
                return userAccounts.get(i);
            }
        }
        return null;
    }

    public UserAccount findAccountByPhoneNumber(String phoneNumber) throws AccountNotFoundException {
        for(int i = 0; i < userAccounts.size(); i++) {
            if(userAccounts.get(i).getPhoneNumber() == phoneNumber) {
                return userAccounts.get(i);
            }
        }
        return null;
    }

}
