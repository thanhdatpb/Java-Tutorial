package JavaLogin;

import java.util.Scanner;

public class LoginView {
    public static Scanner scanner = new Scanner(System.in);

    public void showMessage(String smg) {
        System.out.println(smg);
    }

    public LoginModel getUserInfo() {
        LoginModel user = new LoginModel();
        System.out.print("Username: ");
        user.setUserName(scanner.next());
        System.out.print("Password: ");
        user.setPassword(scanner.next());
        return user;
    }
}