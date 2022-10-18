package p08_abstraction;

/*
Abstract Classes and Methods
Data abstraction is the process of hiding certain details 
and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 
*/
public class Main {
    public static void main(String[] args) {
        LoginService log1 = new LoginService();
        log1.logInUser();
    }
}
