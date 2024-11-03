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

    public LPAStudent() {
        super();
        Random random = new Random();
        double min = 0.00;
        double max = 100.00;
        percentComplete = (random.nextDouble() * (max - min)) + min;
    }
}
