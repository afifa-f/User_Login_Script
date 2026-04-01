void main() {

    //Procedural log in script

    //hard coded username and password for testing purposes only
    String userName = "CrazyCray";
    String password = "HelloWorld!";

    boolean loggedIn = false;
    byte failedAttempts = 0;

    //Log in loop will exit if correct password and username is entered or if wrong details have been entered 3 times
    while (!loggedIn && failedAttempts < 3) {
        IO.println("Enter username:");
        String enteredUserName = IO.readln();

        IO.println("Enter your password");
        String enteredPassword = IO.readln();

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            IO.println(userName + " has logged in");
            loggedIn = true;
            //
        } else {
            failedAttempts++; //tallies number of failed attempts
            if (failedAttempts < 3){
                IO.println("Incorrect username or password!");
            }
        }
    }

    if (failedAttempts == 3) {
        IO.println("LOCKED OUT");
    }
}
