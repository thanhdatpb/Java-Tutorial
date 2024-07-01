package JavaLogin;

public class App {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController control = new LoginController(view);
        //Goi ham Login
        control.login();
    }
}