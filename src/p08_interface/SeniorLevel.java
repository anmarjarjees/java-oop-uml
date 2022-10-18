package p08_interface;

/*
 * If we don't implement any method from the interface,
 * Java will throw this error:
 * "The type SeniorLevel must implement the inherited abstract method
 * PaymentCalculator.calculateGross()" 
 */
public class SeniorLevel implements PaymentCalculator {
    // Quick Fix with VScode will suggest to you to add the method calculateGross()
    @Override
    public double calculateGross(double hours) {
        // Initialization means providing a default value for a variable at the time of
        // declaration
        double payRate = 40; // initialize the variable "payRate" with the value of $40
        // 3. Hours x Pay Rate:
        double payPerWeek = hours * payRate;

        return payPerWeek;
    }

    // We have to add doSomething method based on the Interface requirements
    // for implementing all the methods:
    @Override
    public void doSomething(int i, double x) {
        // TO DO Auto-generated method stub

    }

}
