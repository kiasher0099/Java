class BicycleDemo {
    public static void main(String[] args) {
        // Create two different Bicycle objects 
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        
        // Create a subclass object
        BicycleRoad bike3 = new BicycleRoad();

        // Invoke methods on those objects
        bike1.changeCadence(20);
        bike1.speedUp(5);
        bike1.changeGear(1);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        // Invoke subclass - road bike
        bike3.getMaximumSpeed(50);
        bike3.changeCadence(20);
        bike3.speedUp(15);
        bike3.changeGear(3);
        bike3.printStates();
    }
}