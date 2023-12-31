package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.DAYS;

public class Worker {

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy").withLocale(Locale.US);
    private String name;
    private LocalDate birthDate;
    private LocalDate endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Worker() {}

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.setBirthDate(LocalDate.parse(birthDate, formatter));
        this.setEndDate(LocalDate.parse(endDate, formatter));
    }

    public long getAge() {
        LocalDate currentDate = LocalDate.now();
        Duration duration = Duration.ofDays(DAYS.between(currentDate, this.getBirthDate()));
        return Math.abs(duration.toDays());
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.setEndDate(LocalDate.parse(endDate, formatter));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
