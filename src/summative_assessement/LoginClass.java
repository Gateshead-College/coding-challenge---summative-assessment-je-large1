package summative_assessement;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginClass {
    ArrayList<User> users;

    public static void main(String[] args) {
        LoginClass login = new LoginClass();
        login.users = login.getUsers();
        while(true)
            login.checkDetails();
    }

    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("James", "Jameslarge567", "James", "Large", 1, true));
        users.add(new User("Gdingle", "vodka", "Gareth", "Dingle", 2, true));
        users.add(new User("wackawacka", "youknow", "William", "Cornelius", 3, false));
        return users;
    }

    public void checkDetails(){
        System.out.println("Oi you! enter your Username");
        String username = new Scanner(System.in).nextLine();
        System.out.println("You better enter your password too if you think you're getting in this system");
        String password = new Scanner(System.in).nextLine();
        for(User u : users) {
            if (username.equals(u.username)&&(password.equals(u.password))){
                    Application application = new Application();
                    application.mainMenu();
                    application.mainMenuChoice();


            }
            System.out.println("Incorrect username/password, please try again you donut.");
        }
    }
}

