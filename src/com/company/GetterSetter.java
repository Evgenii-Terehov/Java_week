package com.company;

class Car {
    public static int number;
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
        System.out.println(car.getModel() + "\n" + car.getColor());
        car.setModel("Lada");
        car.setColor("Green");
        System.out.println(car.getModel() + "\n" + car.getColor());
    }
}
class Quest {
    Quest (int i){
        System.out.print("Constructor");
    }
    public static void main(String[] args){
        Quest quest = new Quest(); //1
    }
    public Quest() {
        new Quest(1);
        //3
    }
}
