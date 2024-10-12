package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LPAStudent extends Student {
    private final BigDecimal percentComplete;

    public BigDecimal getPercentComplete() {
        return percentComplete;
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), this.getPercentComplete());
    }

    public LPAStudent() {
        int scale = 2;
        Double percentCompleteDoubleValue =  Double.valueOf(random.nextDouble()) * 100;
        percentComplete = new BigDecimal(percentCompleteDoubleValue).setScale(scale, RoundingMode.HALF_UP);
    }
}
