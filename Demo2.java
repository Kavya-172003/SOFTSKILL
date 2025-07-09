import java.util.Scanner;

class Demo3 { 
    Scanner sc = new Scanner(System.in);

    void login() {
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter password:");
        String password = sc.next();

        if (username.equals("admin@123") && password.equals("123456789")) {
            System.out.println("Login success");
        } else {
            System.out.println("Unsuccessful login");
        }
    }
}

public class Demo2 {
    public static void main(String args[]) {
        Demo3 d = new Demo3();
        d.login();
    }
}
