import java.util.regex.Pattern;

public class RegistrationRules extends UserData {
    public RegistrationRules(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);
    }

    private static final String AllOWED_CHARS = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzcvbnm1234567890_";
    private static final Pattern REGEX = Pattern.compile("^[A-Za-z0-9_]{5,20}$");

    public static void checkLogin(String login) {
        char[] symbols = login.toCharArray();
        if (login.length() > 20) {
            throw new WrongLoginException("Логин должен содержать меньше 21символа");
        }
        for (int i = 0; i < symbols.length; i++) {
            if (!AllOWED_CHARS.contains((String.valueOf(symbols[i])))) {
                throw new WrongLoginException("В логине разрешены,только Латинские символы любого регистра,цифры " +
                        "и нижнее подчеркивание");
            }
        }

    }

    public static void checkPassword(String password) {
    }
}
