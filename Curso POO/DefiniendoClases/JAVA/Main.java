class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Account account = new Account("Andres Herrera", "987456321");
        Car car = new Car("ASD123",account);
        car.passenger = 4;
        car.printDataCar();

        Account account2 = new Account("Andrea Herrera", "123456789");
        Car car2 = new Car("ASD456",account2);
        car2.passenger = 2;
        car2.printDataCar();


    }
}