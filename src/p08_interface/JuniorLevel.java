package p08_interface;

public class JuniorLevel implements PaymentCalculator {

    @Override
    public double calculateGross(double hours) {
        // Initialization means providing a default value for a variable at the time of
        // declaration
        double payRate = 25; // initialize the variable "payRate" with the value of $25
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
