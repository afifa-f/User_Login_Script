void main() {
    Scanner scanner = new Scanner(System.in);

    //hard coded username and password for testing purposes only
    String userName = "CrazyCray";
    String password = "HelloWorld!";

    boolean loggedIn = false;
    String enteredUserName;
    String enteredPassword;
    int failedAttempts = 0;

    //Log in loop will exit if correct password and username is entered or if wrong details have been entered 3 times
    while (!loggedIn && failedAttempts < 3) {
        //username and password entry wrapped in do while loops to handle empty inputs
        do {
            IO.println("Enter username:");
            enteredUserName = scanner.nextLine();
            if (enteredUserName.isBlank()){
                IO.println("Username cannot be blank");
            }
        } while (enteredUserName.isBlank());

        do {
            IO.println("Enter your password");
            enteredPassword = scanner.nextLine();
            if (enteredPassword.isBlank()){
                IO.println("Password cannot be blank");
            }
        } while (enteredPassword.isBlank());

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            IO.println(userName + " has logged in");
            loggedIn = true;
        } else {
            failedAttempts++;
            if (failedAttempts < 3) {
                int attempts = 3 - failedAttempts;
                IO.println("Incorrect username or password! " + attempts + " attempts remaining");
            }
        }
    }

    if (failedAttempts == 3) {
        IO.println("LOCKED OUT");
    } //informing user of

    scanner.close();
}
