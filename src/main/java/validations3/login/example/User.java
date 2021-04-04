package validations3.login.example;

public class User {
    @ValidCredentials
    private Login login;

    public User(Login login) {
        this.login = login;
    }
}
