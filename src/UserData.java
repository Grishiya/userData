public class UserData {
    private String login;
    private String password;
    private String confirmPassword;

    public UserData(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String toString() {
        return "Логин: " + getLogin() +
                ". Пароль: " + getPassword() +
                ".";
    }
}
