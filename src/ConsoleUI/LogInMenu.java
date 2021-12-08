package ConsoleUI;


public class LogInMenu implements Menu {

    private String username;
    private String password;


    private void logInMenu() {
        System.out.println("**** Log In ****\n");
        System.out.print("Username: ");
        username = Menu.getStringFromUser();
        System.out.print("Password: ");
        password = Menu.getStringFromUser();
        checkAccountDetails();
    }

    @Override
    public void runMenu() {
        logInMenu();
    }

    public void checkAccountDetails() {
        if (Menu.grantAccess(username, password)) {
            Menu.returnToMainMenu();
        } else {
            System.err.println("Incorrect Username or Password. Please try again!");

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
            logInMenu();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

runnable.run();
        }


    }
}
