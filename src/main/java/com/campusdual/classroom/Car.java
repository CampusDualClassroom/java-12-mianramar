package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){}

    public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop(){
        if(this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public boolean isTachometerEqualToZero(){
        boolean tacho;
        if(this.tachometer == 0){
            tacho = true;
            System.out.println("O valor do tacómetro é 0");
        } else {
            tacho = false;
            System.out.println("O valor do tacómetro non é 0");
        }
        return tacho;
    }

    public boolean isTachometerGreaterThanZero(){
        boolean tacho;
        if(this.tachometer == 0){
            tacho = false;
        } else {
            tacho = true;
        }
        return tacho;
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED){
            this.speedometer += 10;
        } else {
            System.out.println("Non pode acelerar mais");
        }
    }

    public void brake(){
        if (this.speedometer > 0){
            this.speedometer -= 10;
        } else {
            System.out.println("O coche xa está parado");
        }
    }

    public void turnAngleOfWheels(int wheelsAngle){
        if(wheelsAngle >= -45 && wheelsAngle<=45){
            this.wheelsAngle = wheelsAngle;
        } else if(wheelsAngle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = 45;
        }
        System.out.println("O angulo das rodas é de " + this.wheelsAngle);
    }

    public void setReverse(boolean reverse){
        if(this.speedometer > 0){
            this.reverse = false;
            this.gear = "N";
            System.out.println("O coche debe estar detido para activar a marcha atrás");
        } else {
            this.reverse = true;
            this.gear = "R";
            System.out.println("Activada a marcha atrás");
        }
    }
}
