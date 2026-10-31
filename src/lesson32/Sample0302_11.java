package lesson32;

public class Sample0302_11 {
    public static void main(String[] args) {
        Engine obj = new Car(9999, "white");
//        Engine obj = new Boat(9999, "white");
//        Engine obj = new AirPlane(9999, "white");
        
        switch (obj) {
        case Car c -> System.out.println("Car：" + c.number() + ", " + c.color());
        case Boat b -> System.out.println("Boat：" + b.number() + ", " + b.color());
        case AirPlane a -> System.out.println("AirPlane：" + a.number() + ", " + a.color());
        // default句は記述しなくてよい
        }
    }
}
