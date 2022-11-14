public class UserAccount {
    private String id;
    private String email;
    private String name;
    private String zipCode;
    private String phoneNumber;

    public void buildUserAccount(String email, String name, String zipCode, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        setId();
    }

    public String getZipCode() {
        return zipCode;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setId() {
        id = zipCode + phoneNumber;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
