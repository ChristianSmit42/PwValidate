import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args){
        ArrayList<Password> passwords = new ArrayList<Password>();
        Password password1 = new Password();
        password1.setPassword("aaa");
        passwords.add(password1);

        Password password2 = new Password();
        password2.setPassword("aaaBBB");
        passwords.add(password2);

        Password password3 = new Password();
        password3.setPassword("aaaBBBddd");
        passwords.add(password3);

        Password password4 = new Password();
        password4.setPassword("aaaBBBddd34");
        passwords.add(password4);

        Password password5 = new Password();
        password5.setPassword("BBB111111111");
        passwords.add(password5);

        Password password6 = new Password();
        password6.setPassword("aaaaaa8888888");
        passwords.add(password6);

        for (Password password : passwords) {
            System.out.println("Password: " + password.getPassword() + " valid: " + password.validate() + " Errors: " + password.errorMessage);
        }
    }
}
