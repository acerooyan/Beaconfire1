public class Main {

    public class Car{
        public static class Wheel{
            public Wheel()
            {
                System.out.println("Wheel Created");
            }
        }

        public Car()
        {
            System.out.println("Car created");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Car.Wheel wheel = new Car.Wheel();
    }

    int i = 1;
}
