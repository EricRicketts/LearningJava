package org.example;

import java.util.Random;

public class LPAStudent extends StudentModel {

    private double percentComplete;

    public double getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(double percentComplete) {
        this.percentComplete = percentComplete;
    }

    @Override
    public String toString() {
        return "LPAStudent{" +
                super.toString() + " " +
                "percentComplete=" + percentComplete +
                "}";
    }

    public String toStringWithCarriageReturn() {
        return this.toString() + "\n";
    }

    public LPAStudent() {
        super();
        Random random = new Random();
        double min = 0.00;
        double max = 100.00;
        percentComplete = (random.nextDouble() * (max - min)) + min;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("percentComplete")) {
            return this.getPercentComplete() <= Integer.parseInt(value);
        }
        return super.matchFieldValue(fieldName, value);
    }
}
