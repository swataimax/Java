package lesson32;

public sealed interface Engine permits Car, Boat, AirPlane {}

record Car(int number, String color) implements Engine {}

record Boat(int number, String color) implements Engine {}

record AirPlane(int number, String color) implements Engine {}
