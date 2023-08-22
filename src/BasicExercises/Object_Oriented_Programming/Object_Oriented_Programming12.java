package BasicExercises.Object_Oriented_Programming;

import java.time.LocalTime;

public class Object_Oriented_Programming12 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Самолет» с номером рейса, пунктом назначения и атрибутами
        времени вылета, а также методами проверки статуса рейса и задержки.
         */

//        Plane plane1 = new Plane("Q4578", "Moscow", LocalTime.of(11, 50));
//        Plane plane2 = new Plane("S5614", "Krasnodar", LocalTime.of(14, 50));
//        Plane plane3 = new Plane("A8279", "Saint Petersburg", LocalTime.of(17, 0));
//
//        System.out.println("Flight status:");
//        plane1.checkStatus();
//        plane2.checkStatus();
//        plane3.checkStatus();
//
//        plane1.delay(40);
//        plane3.delay(20);
//
//        System.out.println("\nUpdated flight status:");
//        plane1.checkStatus();
//        plane2.checkStatus();
//        plane3.checkStatus();
    }
}

//class Plane {
//    String flightNumber;
//    String destination;
//    LocalTime departureTime;
//    int delayTime;
//
//    public Plane(String flightNumber, String destination, LocalTime departureTime) {
//        this.flightNumber = flightNumber;
//        this.destination = destination;
//        this.departureTime = departureTime;
//        this.delayTime = 0;
//    }
//
//    public String getFlightNumber() {
//        return flightNumber;
//    }
//
//    public void setFlightNumber(String flightNumber) {
//        this.flightNumber = flightNumber;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public LocalTime getDepartureTime() {
//        return departureTime;
//    }
//
//    public void setDepartureTime(LocalTime departureTime) {
//        this.departureTime = departureTime;
//    }
//
//    public int getDelayTime() {
//        return delayTime;
//    }
//
//    public void delay(int minute) {
//
//        this.delayTime = minute;
//        this.departureTime = this.departureTime.plusMinutes(minute);
//    }
//
//    public void checkStatus() {
//        if (delayTime == 0) {
//            System.out.println("Flight " + getFlightNumber() + " does not linger");
//        } else {
//            System.out.println("Flight " + getFlightNumber() + " delayed by " + getDelayTime() + " minutes");
//        }
//    }
//}