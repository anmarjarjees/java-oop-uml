package p03_encapsulation;

import java.util.ArrayList;
import java.util.List;

/*
 * Coupling is one the OOP terminologies:
 * The dependency of one class/object on the other class/object
 * So coupling refer to the connection that two classes have with each other
 * which means any simple change we add to the "User class"
 * This topic has more details if we talk about types of coupling:
 * - Loose Coupling: When two classes, modules, or components have low dependencies on each other, 
 * it is called loose coupling in Java
 * - Tight Coupling: When two classes are highly dependent on each other, it is called tight coupling
 * 
 * In Java environment, the less dependency we have between two classed is better for maintain, 
 * updating and debugging, so "loose coupling" which is "GOOD" is better than "tight coupling" which is "BAD".
 */
// Example of Tight (Bad) Coupling
public class Main {
    public static void main(String[] args) {
        User user2 = new User("Martin", 5);
        user2.greetAll();
        // now we are targeting/accessing the other class "User" fields directly:
        // public fields!
        user2.name = "Sam";
        user2.subNum = 7;
        user2.greetAll();
        /*
         * So from the main() method inside class "Main",
         * we were able to go inside the class "User" and modify its fields!
         * So what happened if we changed the "User" class
         * by making these two fields to be "private"?
         * Yes, we have to modify our code in this class Main
         * and imagine if we have multiple classes depends on class "User"
         * It's a simple example of Tight (Bad) Coupling
         * 
         * SOLUTION: Using encapsulation with getter and setter
         */

        // now we CANNOT target/access the other class "Members" fields directly:
        // private fields
        Member member1 = new Member("Sam Simpson", "Golden Membership");
        // We cannot change their values:
        // member1.memberName = "Sam";
        // member1.membershipType = "Silver Membership";

        // Even we cannot access its fields values directly:
        // System.out.println("Our first member is "+ member1.memberName);

        // We can only use getter
        System.out.println("Our first member is " + member1.getMemName());

        Member member2 = new Member("Sally Solfege", "Bronze Membership");

        Member member3 = new Member("Alex Chow", "Silver Membership");

        Member member4 = new Member("Martin Smith", "Golden Membership");

        Member member5 = new Member("Kate Wilson", "Silver Membership");

        // Creating a list of type "Member"
        List<Member> members = new ArrayList<Member>();
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);
        // or
        members.add(new Member("James Dean", "Bronze Membership"));

        // Looping and printing all members:
        for (Member member : members) {
            System.out.println(member.getMemName());
        }

        // Let's practice the class "Account":
        // ***********************************
        Account account1 = new Account();
        // error because "balance" is private
        // account.balance= 600;
        account1.deposit(300);
        // again
        account1.deposit(400);

        System.out.println("Main.main(): Your current Balance: " + account1.getBalance());
        account1.withdraw(-5);

        account1.withdraw(1000);

        account1.withdraw(699);
    }
}
