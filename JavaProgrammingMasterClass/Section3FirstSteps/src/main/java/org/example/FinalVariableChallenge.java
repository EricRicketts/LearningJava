package org.example;

public class FinalVariableChallenge {

    public static int result() {
        int myFirstVariable = 100;
        int mySecondVariable = 200;
        int myThirdVariable = 300;
        int myTotal = myFirstVariable + mySecondVariable + myThirdVariable;

        int myLastOne = myTotal - 1000;
        return myLastOne;
    }
}
