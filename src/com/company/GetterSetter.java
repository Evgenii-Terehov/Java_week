package com.company;

import java.util.Comparator;

class Car {

    private String model;
    private String color;
    Car (){
        this("Model Default");
    }
    Car (String model){
        this("Color Default", model);
    }
    Car (String color, String model){
        this.color = color;
        this.model = model;
        this.info();
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String model){
        System.out.println("Нельзя изменить модель машины.");
    }
    public void setColor(String color){
        this.color = color;
    }

    public void run(){
        System.out.println("Car - Run...");
    }
    public void stop(){
        System.out.println("Car - Stop...");
    }
    public void info(){
        System.out.println("Car Model: " + model + ", Car Color: " + color);
    }
}

class Testt {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Ford");
        Car car2 = new Car("RED", "Ford");
        car.run();
        car1.stop();
        System.out.println(car2.getModel() + "\n" + car2.getColor());
        car2.setModel("Lada");
        car2.setColor("Green");

        System.out.println(car2.getModel() + "\n" + car2.getColor());
    }
}



class CreditCalculator {
    private int monthlyPayment = 1000;
    public void setAmount(int i) {}
    public void setYears(int i){}
    public void calculate(){}
    public int getMonthlyPayment (){
        return this.monthlyPayment;
    }

}

// Another example of getter and setter

class Application {

    private CreditCalculator calculator;

    public void init() {
        calculator = new CreditCalculator();
    }
    public void run() {
        calculator.setAmount(500000);
        calculator.setYears(3);
        calculator.calculate();
        System.out.println("Месячный платеж: " + calculator.getMonthlyPayment());
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.run();
    }
}
