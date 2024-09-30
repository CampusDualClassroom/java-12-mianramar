package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara", "Diésel");

        // Un método booleano que verifique si el valor del tacómetro es cero
        myCar.isTachometerEqualToZero();

        // Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        myCar.start();
        myCar.isTachometerGreaterThanZero();

        // Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        myCar.start();

        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();
        myCar.isTachometerEqualToZero();

        // Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        myCar.start();
        myCar.accelerate();
        myCar.stop();

        // Acelerar el coche
        myCar.accelerate();

        // Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for(int i=1; i < 12; i++){
            myCar.accelerate();
        }

        // Frenar la velocidad
        myCar.brake();

        // Frenar hasta un valor negativo (y comprobar que no se puede)
        for(int i=1; i < 14; i++){
            myCar.brake();
        }

        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);

        // Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        myCar.turnAngleOfWheels(200);
        myCar.turnAngleOfWheels(-200);

        // Detener el coche y poner marcha atrás
        myCar.stop();
        myCar.setReverse(myCar.reverse);

        // Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        myCar.accelerate();
        myCar.setReverse(myCar.reverse);
    }

}