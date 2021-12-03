import java.util.Date;

public class MinimalXmlUser {
    private String username;
    private Date registrationDate;

    // Required by Jackson, auto generated by Java if no other ctor defined
    public MinimalXmlUser(){}

    // Getters and setters required by Jackson
    // Alternative: public fields, or annotated fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}