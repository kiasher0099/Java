class BicycleRoad extends Bicycle {
    // New fields and methods defining a road bicycle 
    int mSpeed = 0;
    
    void getMaximumSpeed(int maxSpeed) {
        mSpeed = maxSpeed;
    }

    void printStates() {
        System.out.println("cadence: " + cadence +
            " speed: " + speed + " gear: " + gear + " MaxSpeed:" + mSpeed);
    }
}