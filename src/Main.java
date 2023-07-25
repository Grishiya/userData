import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        UserData userData = new UserData(login, password, confirmPassword);
        System.out.println(userData);
        RegistrationRules.checkLogin(login);
    }
}