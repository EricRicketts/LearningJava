package org.example;

public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    private String drawLogo() {
        return monitor.drawPixelAt(1200, 50, "yellow");
    }

    public String powerUp() {
        return computerCase.pressPowerButton() + " " + this.drawLogo();
    }

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
}
